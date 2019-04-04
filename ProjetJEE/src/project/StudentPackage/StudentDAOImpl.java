package project.StudentPackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import project.DBManager;

public class StudentDAOImpl implements StudentDAO {
	
	List<Student> listStudents = new ArrayList<Student>() ;
	Connection connection ;
	Statement statement ;
	ResultSet rs ;
	
	@Override
	public List<Student> findByAll() {
		
		try {
			connection = DBManager.getInstance().getConnection() ;
			statement = connection.createStatement() ;
			rs = statement.executeQuery("call listeStudent()") ;
			
			while (rs.next()) {
				int id = rs.getInt("id") ;
				String nom = rs.getString("nom") ;
				String prenom = rs.getString("prénom") ;
				Date dateNaissance = rs.getDate("dateNaissance") ;
				listStudents.add(new Student(id, nom, prenom, dateNaissance)) ;
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return listStudents ;
	}

	@Override
	public List<Student> EtudiantExclusDuGroupe(String nG) {
		
		try {
			connection = DBManager.getInstance().getConnection() ;
			statement = connection.createStatement() ;
			rs = statement.executeQuery("select id, nom, prénom, dateNaissance from Student where id in (select Student_id from excludedStudent where Groupe_nomG = \""+nG+"\")");
			
			while (rs.next()) {
				int id = rs.getInt("id") ;
				String nom = rs.getString("nom") ;
				String prenom = rs.getString("prénom") ;
				Date dateNaissance = rs.getDate("dateNaissance") ;
				listStudents.add(new Student(id, nom, prenom, dateNaissance)) ;
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return listStudents ;
	}
	
	@Override
	public List<Student> EtudiantDuGroupe(String nG) {
		
		try {
			connection = DBManager.getInstance().getConnection() ;
			statement = connection.createStatement() ;
			rs = statement.executeQuery("select id, nom, prénom, dateNaissance from Student where id in (select Student_id from Student_has_Groupe where Groupe_nomG = \""+nG+"\")");
			
			while (rs.next()) {
				int id = rs.getInt("id") ;
				String nom = rs.getString("nom") ;
				String prenom = rs.getString("prénom") ;
				Date dateNaissance = rs.getDate("dateNaissance") ;
				listStudents.add(new Student(id, nom, prenom, dateNaissance)) ;
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return listStudents ;
	}
	
	public ResultSet showStudent(int id) {
		
		try {
			connection = DBManager.getInstance().getConnection() ;
			statement = connection.createStatement() ;
			rs = statement.executeQuery("call showStudent("+id+")");
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return rs ;
	}

}
