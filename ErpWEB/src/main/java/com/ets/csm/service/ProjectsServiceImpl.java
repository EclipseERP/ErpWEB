package com.ets.csm.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.ets.csm.model.Cake;
import com.ets.csm.model.Projects;
import com.ets.csm.repository.ProjectsRepository;

@Service
public class ProjectsServiceImpl implements ProjectsService {
	
	@Autowired
	ProjectsRepository projectrepo;

	@Override
	public List getAllProjects() {
		// TODO Auto-generated method stub
		return projectrepo.getAllProjects();
	}
	
	@Override
	public List getAllProjectsByID(Integer id) {
		
		return projectrepo.getAllProjectsByID(id);
	}
	
	@Override
	public Projects saveOrUpdate(Projects project) {
		
		return projectrepo.save(project);
				
	}
	
	@Override
	public void removeProject(Projects project) {
		projectrepo.delete(project);
	}

}