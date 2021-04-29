package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/merhaba2")
public class Merhaba2Servlet extends HttpServlet {
	private static final long serialVersionUID = -4794574945455641651L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String isim = request.getParameter("isim");
		request.setAttribute("ad", isim);
		request.getRequestDispatcher("/merhaba2.jsp").forward(request, response);
	}

}
