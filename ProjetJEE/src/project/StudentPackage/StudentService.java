package project.StudentPackage;
import java.sql.ResultSet;
import java.util.List;

public interface StudentService {
	List<Student> getAllStudents() ;
	List<Student> getStudentExcludedFromG(String nG) ;
	List<Student> getStudentFromG(String nG) ;
	ResultSet FicheEtudiant(int id) ;
}
