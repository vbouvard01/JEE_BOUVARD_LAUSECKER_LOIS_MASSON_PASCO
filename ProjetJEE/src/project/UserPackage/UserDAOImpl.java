package project.UserPackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import project.DBManager;

public class UserDAOImpl implements UserDAO {

	@Override
	public List<User> findByAll() {
		List<User> listUsers = new ArrayList<User>() ;
		Connection connection ;
		Statement statement ;
		ResultSet rs ;
		
		try {
			connection = DBManager.getInstance().getConnection() ;
			statement = connection.createStatement() ;
			rs = statement.executeQuery("select * from Utilisateur") ;
			
			while (rs.next()) {
				String identifiant = rs.getString("identifiant") ;
				String mdp = rs.getString("mdp") ;
				String statut = rs.getString("statut") ;
				listUsers.add(new User(identifiant, mdp, statut)) ;
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return listUsers ;
	}

}
