package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.PersonelBusiness;
import entities.Personel;

/**
 * Servlet implementation class PersonelServlet
 */
@WebServlet("/kullaniciYarat")
public class PersonelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String adi = request.getParameter("adi");
		String soyadi = request.getParameter("soyadi");
		String tcno = request.getParameter("tcno");
		String sifre = request.getParameter("sifre");
		Personel personel = new Personel(0, adi, sifre, soyadi, tcno, null);
		new PersonelBusiness().PersonelYarat(personel);
		request.setAttribute("mesaj", "Kullan?c? olu?tu");
		request.getRequestDispatcher("/").forward(request, response);
	}

}
