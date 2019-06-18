package com.ets.csm.service;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;


import com.ets.csm.model.Projects;

public interface ProjectsService {
	public List getAllProjects();
	public List getAllProjectsByID(Integer id);

	public Projects saveOrUpdate(Projects p);
	public void removeProject(Projects p);
	public List getProjectByProjectcode(String projectcode);
	public List<Projects> getProjectGroupByProjectCode();
	public List<Projects> getProjectByState(String state);
	public List<Projects> getProjectByYear(String state);
	public List<Projects> getProjectByLoa(String state);
	
	
}
