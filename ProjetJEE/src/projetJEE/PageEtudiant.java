package projetJEE;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageEtudiant extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String myParameter=request.getParameter("param");
		
		out.println("<html>");
		out.println("<head><title>Hello World</title></head>");
		out.println("<body>");
		out.println("<h1> Hello World !"+myParameter+"</h1>");
		out.println("</body></html>");
	}  
}
