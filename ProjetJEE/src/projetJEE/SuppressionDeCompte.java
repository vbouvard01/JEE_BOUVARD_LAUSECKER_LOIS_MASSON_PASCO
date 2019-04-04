package projetJEE;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuppressionDeCompte extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String myParameter=request.getParameter("param");
		
		out.println("<html>");
		out.println("<head><title>compte supprimé</title></head>");
		out.println("<body>");
		out.println("<h1>compte supprimé</h1>");
		out.println("<form action=\"/JEE_BOUVARD_LAUSECKER_LOIS_MASSON_PASCO_ProjetJEE/Accueil\" method=\"GET\">");
		out.println("retour à l'accueil");
		out.println("<input type=\"submit\"></input>");
		out.println("</form>");
		out.println("</body></html>");
	}
}
