package project.GroupPackage;

import java.util.List;

public class GroupServiceImpl implements GroupService {

	private GroupDAO groupDAO = new GroupDAOImpl() ;
	
	@Override
	public List<Group> getAllGroups() {
		return groupDAO.findByAll() ;
	}

	@Override
	public List<Group> GroupsFromGroup(String nG) {
		return groupDAO.GroupesDuGroupe(nG) ;
	}

	@Override
	public List<Group> GroupsFromStudent(int id) {
		return groupDAO.GroupesDeLEtudiant(id) ;
	}

	@Override
	public List<Group> GroupsWhereStudentIsExcluded(int id) {
		return groupDAO.GroupesDontLEtudiantAEteExclus(id) ;
	}

}
