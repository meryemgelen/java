package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MerhabaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("ISO-8859-9");
		PrintWriter out = response.getWriter();
		String isim = request.getParameter("isim");
		out.print("<!DOCTYPE html>");
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"ISO-8859-9\">");
		out.print("</head>");
		out.print("<body>");
		out.print("Nasýlsýn " + isim);
		out.print("</body>");
		out.print("</html>");

	}

}
