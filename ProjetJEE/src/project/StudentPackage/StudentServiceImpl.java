package project.StudentPackage;
import java.sql.ResultSet;
import java.util.List;

public class StudentServiceImpl implements StudentService {
	
	private StudentDAO studentDAO = new StudentDAOImpl() ;
	
	@Override
	public List<Student> getAllStudents() {
		return studentDAO.findByAll() ;
	}

	@Override
	public List<Student> getStudentExcludedFromG(String nG) {
		return studentDAO.EtudiantExclusDuGroupe(nG) ;
	}
	
	public List<Student> getStudentFromG(String nG) {
		return studentDAO.EtudiantDuGroupe(nG) ;
	}

	@Override
	public ResultSet FicheEtudiant(int id) {
		return studentDAO.showStudent(id) ;
	}

}
