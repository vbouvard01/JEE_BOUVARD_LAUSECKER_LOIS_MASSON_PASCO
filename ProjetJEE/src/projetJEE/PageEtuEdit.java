package projetJEE;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageEtuEdit extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		/*todo verif admin*/
			
		out.println("<html>");
		out.println("<body>");
		out.println("creer/modifier etudiant");
		out.println("<form action=\"/JEE_BOUVARD_LAUSECKER_LOIS_MASSON_PASCO_ProjetJEE/ConfCon\" method=\"POST\">");
		out.println("<input type=\"text\" value=\"numéro\" name=\"identifiant\" id=\"id1\"></input>");
		out.println("<input type=\"text\" value=\"mot de passe\" name=\"mdp\" id=\"id2\"></input>");
		out.println("<input type=\"submit\"></input>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
			
		
		
	}  
}
