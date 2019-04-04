<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "java.util.List, java.util.Date, java.sql.ResultSet, project.StudentPackage.StudentService, project.StudentPackage.StudentServiceImpl, project.StudentPackage.Student, project.GroupPackage.GroupService, project.GroupPackage.GroupServiceImpl, project.GroupPackage.Group"%>

<%
int id = Integer.parseInt(request.getParameter("id")) ;
StudentService studentService = new StudentServiceImpl() ;
ResultSet rs = studentService.FicheEtudiant(id) ;
GroupService groupService = new GroupServiceImpl() ;
List<Group> listGroups = groupService.GroupsFromStudent(id) ;
GroupService groupService2 = new GroupServiceImpl() ;
List<Group> listExcludedGroups = groupService2.GroupsWhereStudentIsExcluded(id) ;
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
			<tr>
				<th>Courriel pro</th>
				<%String courrielPro = rs.getString("courrielPro") ;%>
				<td><%=courrielPro %></td>
			</tr>
			<tr>
				<th>Courriel perso</th>
				<%String courrielPerso = rs.getString("courrielPerso") ;%>
				<td><%=courrielPerso %></td>
			</tr>
			<tr>
				<th>Série Bac</th>
				<%String serieBac = rs.getString("serieBac") ;%>
				<td><%=serieBac %></td>
			</tr>
			<tr>
				<th>Date Bac</th>
				<%Date dateBac = rs.getDate("dateBac") ;%>
				<td><%=dateBac %></td>
			</tr>
			<tr>
				<th>Mention Bac</th>
				<%String mentionBac = rs.getString("mentionBac") ;%>
				<td><%=mentionBac %></td>
			</tr>
			<tr>
				<th>Diplôme</th>
				<%String diplome = rs.getString("diplome") ;%>
				<td><%=diplome %></td>
			</tr>
			<tr>
				<th>Date diplôme</th>
				<%Date dateDiplome = rs.getDate("dateDiplome") ;%>
				<td><%=dateDiplome %></td>
			</tr>
			<tr>
				<th>Ville diplôme</th>
				<%String villeDiplome = rs.getString("villeDiplome") ;%>
				<td><%=villeDiplome %></td>
			</tr>
		</table>
	<%} %>
	<h1>Liste des groupes de l'étudiant <%=id %></h1>
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
	<h1>Liste des groupes dont l'étudiant <%=id %> est exclus</h1>
	<table border = "1">
		<tr>
			<th>Nom</th>
			<th>Propriétaire(s)</th>
			<th>Date de création</th>
		</tr>
		<%
		for(Group group:listExcludedGroups) {
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
</body>
</html>