<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "java.util.Date, java.sql.ResultSet, project.StudentPackage.StudentService, project.StudentPackage.StudentServiceImpl, project.StudentPackage.Student"%>

<%
int id = Integer.parseInt(request.getParameter("id")) ;
StudentService studentService = new StudentServiceImpl() ;
ResultSet rs = studentService.FicheEtudiant(id) ;
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fiche de l'étudiant <%=id %></title>
</head>

<body>
	<h1>Fiche de l'étudiant <%=id %></h1>
	<% if(rs.next()) { %>
		<table border = "1">
			<tr>
				<th>Nom</th>
				<%String nom = rs.getString("nom") ;%>
				<td><%=nom %></td>
			</tr>
			<tr>
				<th>Prénom</th>
				<%String prenom = rs.getString("prénom") ;%>
				<td><%=prenom %></td>
			</tr>
			<tr>
				<th>Date de naissance</th>
				<%Date dateNaissance = rs.getDate("dateNaissance") ;%>
				<td><%=dateNaissance %></td>
			</tr>
		</table>
	<%} %>
</body>
</html>