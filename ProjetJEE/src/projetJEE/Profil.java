package projetJEE;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.*;



public class Profil extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Cookie[] lstCoo = request.getCookies();
		String id=lstCoo[0].getValue();
		String statut=lstCoo[1].getValue();
		
		out.println("<html>");
		out.println("<body>");
		out.println("bonjour "+id);
		out.println("<form action=\"/ProjetJEE/listeEtudiants.jsp\" method=\"GET\">");
		out.println("voir page étudiant");
		out.println("<input type=\"submit\"></input>");
		out.println("</form>");
		
		out.println("<form action=\"/ProjetJEE/Accueil\" method=\"GET\">");
		out.println("deconnexion");
		out.println("<input type=\"submit\"></input>");
		out.println("</form>");
		
		out.println("<form action=\"/ProjetJEE/SuppressionDeCompte\" method=\"GET\">");
		out.println("supression du compte");
		out.println("<input type=\"submit\"></input>");
		out.println("</form>");
		
		out.println("<form action=\"/ProjetJEE/ListeGroupe\" method=\"GET\">");
		out.println("Voir page des groupes");
		out.println("<input type=\"submit\"></input>");
		out.println("</form>");
		
		if (statut.equals("edi") || statut.equals("admin")) {
			out.println("<form action=\"/ProjetJEE/ModifGroupe\" method=\"GET\">");
			out.println("modifier groupes");
			out.println("<input type=\"submit\"></input>");
			out.println("</form>");
		}
				
		if (statut.equals("admin")) {
			out.println("<form action=\"/ProjetJEE/PageAdmin\" method=\"GET\">");
			out.println("page administrateur");
			out.println("<input type=\"submit\"></input>");
			out.println("</form>");
		}
		out.println("</body>");
		out.println("</html>");
			
		
		
	}  
}
