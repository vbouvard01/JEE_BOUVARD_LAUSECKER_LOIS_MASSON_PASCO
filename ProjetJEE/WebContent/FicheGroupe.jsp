<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "java.util.List, java.util.Date, project.StudentPackage.StudentService, project.StudentPackage.StudentServiceImpl, project.StudentPackage.Student , project.GroupPackage.GroupService, project.GroupPackage.GroupServiceImpl, project.GroupPackage.Group"%>
<%
String nG =request.getParameter("nomGroupe") ;
StudentService studentService = new StudentServiceImpl() ;
List<Student> listStudents = studentService.getStudentFromG(nG) ;
GroupService groupService = new GroupServiceImpl() ;
List<Group> listGroups = groupService.GroupsFromGroup(nG) ;
StudentService studentService2 = new StudentServiceImpl() ;
List<Student> listExcludedStudents = studentService2.getStudentExcludedFromG(nG) ;
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
			<td><a href=/JEE_BOUVARD_LAUSECKER_LOIS_MASSON_PASCO_ProjetJEE/FicheEtudiant.jsp?id=<%=id%>> <%=id%></a></td>
			<td><%=nom %></td>
			<td><%=prenom %></td>
			<td><%=dateNaissance %></td>
		</tr>
		<%
		}
		%>
	</table>
	
	<h1>Liste des sous-groupes du groupe <%=nG %></h1>
	<table border = "1">
		<tr>
			<th>Nom</th>
			<th>Propriétaire(s)</th>
			<th>Date de création</th>
		</tr>
		<%
		for(Group group:listGroups) {
			String nomG = group.getNomG() ;
			String nomP = group.getNomP() ;
			Date dateCreation = group.getDateCreation() ;
		%>
		<tr>
			<td><a href=/JEE_BOUVARD_LAUSECKER_LOIS_MASSON_PASCO_ProjetJEE/FicheGroupe.jsp?nomGroupe=<%=nomG%>> <%=nomG %></a></td>
			<td><%=nomP %></td>
			<td><%=dateCreation %></td>
		</tr>
		<%
		}
		%>
	</table>
	
	<h1>Liste des étudiants exclus du groupe <%=nG %></h1>
	<table border = "1">
		<tr>
			<th>Identifiant</th>
			<th>Nom</th>
			<th>Prénom</th>
			<th>Date de naissance</th>
		</tr>
		<%
		for(Student student:listExcludedStudents) {
			int id = student.getId() ;
			String nom = student.getNom() ;
			String prenom = student.getPrenom() ;
			Date dateNaissance = student.getDateNaissance() ;
		%>
		<tr>
			<td><a href=/JEE_BOUVARD_LAUSECKER_LOIS_MASSON_PASCO_ProjetJEE/FicheEtudiant.jsp?id=<%=id%>> <%=id%></a></td>
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
	
</body>
</html>