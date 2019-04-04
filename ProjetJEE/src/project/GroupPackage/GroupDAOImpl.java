package project.GroupPackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import project.DBManager;

public class GroupDAOImpl implements GroupDAO {
	List<Group> listGroups = new ArrayList<Group>() ;
	Connection connection ;
	Statement statement ;
	ResultSet rs ;
	
	@Override
	public List<Group> findByAll() {
		
		try {
			connection = DBManager.getInstance().getConnection() ;
			statement = connection.createStatement() ;
			rs = statement.executeQuery("call listeGroupe()") ;
			
			while (rs.next()) {
				String nomG = rs.getString("nomG") ;
				String nomP = rs.getString("Utilisateur_identifiant") ;
				Date dateCreation = rs.getDate("dateCreation") ;
				listGroups.add(new Group(nomG, nomP, dateCreation)) ;
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return listGroups ;
	}

	@Override
	public List<Group> GroupesDuGroupe(String nG) {
		try {
			connection = DBManager.getInstance().getConnection() ;
			statement = connection.createStatement() ;
			rs = statement.executeQuery("select * from Groupe where nomG in (select Groupe_nomG1 from Groupe_has_Groupe where Groupe_nomG = \""+nG+"\")") ;
			
			while (rs.next()) {
				String nomG = rs.getString("nomG") ;
				String nomP = rs.getString("Utilisateur_identifiant") ;
				Date dateCreation = rs.getDate("dateCreation") ;
				listGroups.add(new Group(nomG, nomP, dateCreation)) ;
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return listGroups ;
	}

	@Override
	public List<Group> GroupesDeLEtudiant(int id) {
		try {
			connection = DBManager.getInstance().getConnection() ;
			statement = connection.createStatement() ;
			rs = statement.executeQuery("select * from Groupe where nomG in (select Groupe_nomG from Student_has_Groupe where Student_id ="+id+")") ;
			
			while (rs.next()) {
				String nomG = rs.getString("nomG") ;
				String nomP = rs.getString("Utilisateur_identifiant") ;
				Date dateCreation = rs.getDate("dateCreation") ;
				listGroups.add(new Group(nomG, nomP, dateCreation)) ;
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return listGroups ;
	}
	

	@Override
	public List<Group> GroupesDontLEtudiantAEteExclus(int id) {
		try {
			connection = DBManager.getInstance().getConnection() ;
			statement = connection.createStatement() ;
			rs = statement.executeQuery("select * from Groupe where nomG in (select Groupe_nomG from excludedStudent where Student_id ="+id+")") ;
			
			while (rs.next()) {
				String nomG = rs.getString("nomG") ;
				String nomP = rs.getString("Utilisateur_identifiant") ;
				Date dateCreation = rs.getDate("dateCreation") ;
				listGroups.add(new Group(nomG, nomP, dateCreation)) ;
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return listGroups ;
	}
	

}
