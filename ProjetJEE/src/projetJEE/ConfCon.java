package projetJEE;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project.UserPackage.*;

public class ConfCon extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String myParameter=request.getParameter("param");
		String mdp=request.getParameter("mdp");
		String identifiant=request.getParameter("identifiant");
		
		UserDAO userDAO = new UserDAOImpl() ;
		List<User> listUsers = userDAO.findByAll() ;
		
		int i=0;
		int tr=0;
		while (i<listUsers.size() && tr==0) {
			
			if ((mdp.equals(listUsers.get(i).getMdp())) && (identifiant.equals(listUsers.get(i).getPseudo()))){
				
				Cookie coo=new Cookie("id", identifiant);
				response.addCookie(coo);
				coo=new Cookie("statut", listUsers.get(i).getStatus());
				response.addCookie(coo);
				
				out.println("<html>");
				out.println("<head><title>connection effectuée</title></head>");
				out.println("<body>");
				out.println("<h1>connection effectuée</h1>");
				
				out.println("<form action=\"/JEE_BOUVARD_LAUSECKER_LOIS_MASSON_PASCO_ProjetJEE/Profil\" method=\"GET\">");
				out.println("ok");
				out.println("<input type=\"submit\"></input>");
				out.println("</form>");
				
				out.println("</body></html>");
				tr=1;
			}

			i=i+1;
		}
			
		if (tr==0) {
			this.getServletContext().getRequestDispatcher( "/Accueil" ).forward( request, response );
		}
	}
}
