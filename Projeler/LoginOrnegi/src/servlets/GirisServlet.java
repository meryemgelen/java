package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GirisServlet
 */
@WebServlet("/giris")
public class GirisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adi = request.getParameter("username");
		String sifre = request.getParameter("password");
		if (new StringBuilder(adi).reverse().toString().equals(sifre)) {
			// login oldu.
			request.getSession().setAttribute("login", adi);
			request.getRequestDispatcher("/menu.jsp").forward(request, response);
		} else {
			request.setAttribute("hata", "Yanlýþ Kullanýcý adý / Þifre");
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("hata", "asdfghjkjhgf");
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
