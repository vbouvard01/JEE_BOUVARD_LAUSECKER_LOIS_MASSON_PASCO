<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "java.util.List, java.util.Date, project.StudentPackage.StudentService, project.StudentPackage.StudentServiceImpl, project.StudentPackage.Student"%>
<%
String nG =request.getParameter("nomGroupe") ;
StudentService studentService = new StudentServiceImpl() ;
List<Student> listStudents = studentService.getStudentFromG(nG) ;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des étudiants du groupe <%=nG %></title>
</head>

<body>
	<h1>Liste des étudiants du groupe <%=nG %></h1>
	<table border = "1">
		<tr>
			<th>Identifiant</th>
			<th>Nom</th>
			<th>Prénom</th>
			<th>Date de naissance</th>
		</tr>
		<%
		for(Student student:listStudents) {
			int id = student.getId() ;
			String nom = student.getNom() ;
			String prenom = student.getPrenom() ;
			Date dateNaissance = student.getDateNaissance() ;
		%>
		<tr>
			<td><%=id %></td>
			<td><%=nom %></td>
			<td><%=prenom %></td>
			<td><%=dateNaissance %></td>
		</tr>
		<%
		}
		%>
	</table>
	<br>
	<br>
	<form action="MainServlet", method="post">
	Rechercher un livre :
	<input type = "text", name="searchText"></input>
	<input type = "submit", name="submit"></input>
	</form>
</body>
</html>