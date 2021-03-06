<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "java.util.List, java.util.Date, project.GroupPackage.GroupService, project.GroupPackage.GroupServiceImpl, project.GroupPackage.Group"%>
<%
String nG = request.getParameter("nomG") ;
GroupService groupService = new GroupServiceImpl() ;
List<Group> listGroups = groupService.GroupsFromGroup(nG) ;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des sous-groupes du groupe <%=nG %> </title>
</head>

<body>
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
			<td><%=nomG %></td>
			<td><%=nomP %></td>
			<td><%=dateCreation %></td>
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