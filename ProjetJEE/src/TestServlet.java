import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.* ;

public class TestServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter() ;
		out.println("<html>") ;
		out.println("<head><title>Test</title></head>") ;
		out.println("<body>") ;
		out.println("Je suis le test du projet") ;
		out.println("</body></html>") ;
	}
}
