package projetJEE;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Accueil extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>connexion</title></head>");
		out.println("<body>");
		out.println("<form action=\"/JEE_BOUVARD_LAUSECKER_LOIS_MASSON_PASCO_ProjetJEE/ConfCon\" method=\"POST\">");
		out.println("<input type=\"text\" value=\"identifiant\" name=\"identifiant\" id=\"id1\"></input>");
		out.println("<input type=\"text\" value=\"mot de passe\" name=\"mdp\" id=\"id2\"></input>");
		out.println("<input type=\"submit\"></input>");
		out.println("</form>");
		out.println("</body></html>");
	} 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>connexion</title></head>");
		out.println("<body>");
		out.println("<form action=\"/JEE_BOUVARD_LAUSECKER_LOIS_MASSON_PASCO_ProjetJEE/ConfCon\" method=\"POST\">");
		out.println("<input type=\"text\" value=\"identifiant\" name=\"identifiant\" id=\"id1\"></input>");
		out.println("<input type=\"text\" value=\"mot de passe\" name=\"mdp\" id=\"id2\"></input>");
		out.println("<input type=\"submit\"></input>");
		out.println("</form>");
		out.println("</body></html>");
	}
}
