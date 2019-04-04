package projetJEE;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PageAdmin extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		/*todo verif que admin*/
			
		out.println("<html>");
		out.println("<body>");
		
		out.println("<form action=\"/ProjetJEE/PageEtuEdit\" method=\"GET\">");
		out.println("Gestion des étudiants");
		out.println("<input type=\"submit\"></input>");
		out.println("</form>");
		
		out.println("<form action=\"/ProjetJEE/GestionUtilisateur\" method=\"GET\">");
		out.println("Gestion des utilisateurs");
		out.println("<input type=\"submit\"></input>");
		out.println("</form>");
		
		out.println("<form action=\"/ProjetJEE/GestionGroupeAdmin\" method=\"GET\">");
		out.println("Gestion des groupes");
		out.println("<input type=\"submit\"></input>");
		out.println("</form>");
			
		out.println("</body>");
		out.println("</html>");
			
		
		
	}  
}
