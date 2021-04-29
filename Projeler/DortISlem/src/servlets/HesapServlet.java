package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HesapServlet
 */
@WebServlet("/hesapla")
public class HesapServlet extends HttpServlet {
	private static final long serialVersionUID = -5340861659257831031L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sayi1 = Integer.parseInt(request.getParameter("sayi1"));
		int sayi2 = Integer.parseInt(request.getParameter("sayi2"));
		int sonuc = 0;
		if (request.getParameter("topla") != null) {
			sonuc = sayi1 + sayi2;
		} else if (request.getParameter("cikar") != null) {
			sonuc = sayi1 - sayi2;
		} else if (request.getParameter("carp") != null) {
			sonuc = sayi1 * sayi2;
		} else if (request.getParameter("bol") != null) {
			sonuc = sayi1 / sayi2;
		}
		request.setAttribute("sonuc", sonuc);
		request.getRequestDispatcher("/sonuc.jsp").forward(request, response);

	}

}
