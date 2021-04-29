package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Personel;
import business.PersonelBusiness;

/**
 * Servlet implementation class PersonelServlet
 */
@WebServlet("/personelListesi")
public class PersonelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Personel> personeller = new PersonelBusiness().getPersoneller();
		request.setAttribute("liste", personeller);
		request.getRequestDispatcher("/liste.jsp").forward(request, response);
	}

}
