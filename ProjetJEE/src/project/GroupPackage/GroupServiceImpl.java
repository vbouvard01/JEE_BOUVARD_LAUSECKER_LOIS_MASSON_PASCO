package project.GroupPackage;

import java.util.List;

public class GroupServiceImpl implements GroupService {

	private GroupDAO groupDAO = new GroupDAOImpl() ;
	
	@Override
	public List<Group> getAllGroups() {
		return groupDAO.findByAll() ;
	}

}
