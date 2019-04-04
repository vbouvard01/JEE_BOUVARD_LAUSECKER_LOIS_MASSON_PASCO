package project.GroupPackage;

import java.util.List;

public interface GroupService {
	List<Group> getAllGroups() ;
	List<Group> GroupsFromGroup(String nG) ;
	List<Group> GroupsFromStudent(int id) ;
	List<Group> GroupsWhereStudentIsExcluded(int id) ;
}
