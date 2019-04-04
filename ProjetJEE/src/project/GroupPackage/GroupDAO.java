package project.GroupPackage;

import java.util.List;

public interface GroupDAO {
	List<Group> findByAll() ;
	List<Group> GroupesDuGroupe(String nG) ;
	List<Group> GroupesDeLEtudiant(int id) ;
	List<Group> GroupesDontLEtudiantAEteExclus(int id) ;
}
