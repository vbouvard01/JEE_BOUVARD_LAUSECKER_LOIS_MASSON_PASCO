package project.StudentPackage;
import java.sql.ResultSet;
import java.util.List;

public interface StudentDAO {
	List<Student> findByAll() ;
	List<Student> EtudiantExclusDuGroupe(String nG) ;
	List<Student> EtudiantDuGroupe(String nG);
	ResultSet showStudent(int i);
	
}
