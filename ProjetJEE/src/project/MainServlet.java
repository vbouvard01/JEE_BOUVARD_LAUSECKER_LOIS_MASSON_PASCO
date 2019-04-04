package project;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import project.StudentPackage.Student;
import project.StudentPackage.StudentService;
import project.StudentPackage.StudentServiceImpl;

public class MainServlet extends HttpServlet {
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) {
		
		StudentService studentService = new StudentServiceImpl() ;
		List<Student> listStudents = studentService.getAllStudents() ;
		
		String pageName= "/accueil.jsp" ;
		RequestDispatcher rd = getServletContext().getRequestDispatcher(pageName);
		request.setAttribute("listStudents", listStudents);
		
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		doProcess(request, response) ;
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		doProcess(request, response) ;
	}
}
