package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Birlik;
import business.PersonelBusiness;

/**
 * Servlet implementation class BirlikServlet
 */
@WebServlet("/birlikListesi")
public class BirlikServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Birlik> birlikler = new PersonelBusiness().getBirlikler();
		request.setAttribute("liste", birlikler);
		request.getRequestDispatcher("/birliklist.jsp").forward(request, response);
	}

}
