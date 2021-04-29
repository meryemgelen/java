package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.LoginBusiness;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/giris")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tcno = request.getParameter("tcno");
		String sifre = request.getParameter("sifre");
		String sayfa = null;

		if (new LoginBusiness().login(tcno, sifre)) {
			// login islemi baþarýlý
			System.out.println("login baþarýlý ");
			request.getSession().setAttribute("login", tcno);
			sayfa = "/menu.jsp";

		} else {
			request.setAttribute("hata", "Giriþ bilgileri yanlýþ");
			sayfa = "/";
		}
		request.getRequestDispatcher(sayfa).forward(request, response);
	}

}
