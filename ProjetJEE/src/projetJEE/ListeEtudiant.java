package projetJEE;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ListeEtudiant extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		for (int i=0 ; i<10 ; i++){
			out.println("<a href=/ProjetJEE/FicheEtudiant?param="+(i+1)+">etudiant"+(i+1)+ "</a><br>");
		}
		out.println("</body>");
		out.println("</html>");
	}
}
