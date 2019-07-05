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

	@Override
	public List getProjectByProjectcode(String projectcode) {
		// TODO Auto-generated method stub
		return projectrepo.getAllProjectsByProjectCode(projectcode);
	}
	
	
	@Override
	public List getProjectGroupByProjectCode() {
		// TODO Auto-generated method stub
		return projectrepo.getAllProjectsGroupByLoaNO();
	}

	@Override
	public List<Projects> getProjectByState(String state) {
		
		return projectrepo.findByStateIgnoreCaseStartingWith(state);
	}

	@Override
	public List<Projects> getProjectByYear(String year) {
		return projectrepo.getAllProjectsByYear(year);
	}

	@Override
	public List<Projects> getProjectByLoa(String loa) {
		
		return projectrepo.findByLoanoIgnoreCaseStartingWith(loa);
	}

	@Override
	public List<Projects> getProjectByLoaSateAndYear(String state) {
		
		return projectrepo.findByLoanoIgnoreCaseContainingOrStateIgnoreCaseContainingOrDateContaining(state,state,state);
	}

	@Override
	public Long findProjectsLastId() {
		// TODO Auto-generated method stub
		Projects lastProject =  projectrepo.findFirstByOrderByIdDesc();
		Long lastId=lastProject.getId()+1L;
		return lastId;
		
	}

	@Override
	public Projects merge(Projects p) {
		try {
			return	 projectrepo.merge(p);
		}catch(Exception e) {
			e.printStackTrace();
			return new Projects();
		}
		
		
	}
}
