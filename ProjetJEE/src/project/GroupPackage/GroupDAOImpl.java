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

	@Override
	public List<Group> findByAll() {
		List<Group> listGroups = new ArrayList<Group>() ;
		Connection connection ;
		Statement statement ;
		ResultSet rs ;
		
		try {
			connection = DBManager.getInstance().getConnection() ;
			statement = connection.createStatement() ;
			rs = statement.executeQuery("call listeGroupe()") ;
			
			while (rs.next()) {
				String nomG = rs.getString("nomG") ;
				String nomP = rs.getString("nomP") ;
				Date dateCreation = rs.getDate("dateCreation") ;
				listGroups.add(new Group(nomG, nomP, dateCreation)) ;
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return listGroups ;
	}

}
