package com.ets.csm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ets.csm.model.Projects;
import com.ets.csm.model.User;
import com.ets.csm.service.ProjectsService;
import com.ets.csm.service.UserService;
import com.ets.csm.util.DateUtility;


@Controller
@RequestMapping("/project")

public class ProjectMasterController {
	@Autowired
	UserService userService;
	
	
	@Autowired
	ProjectsService projectservice;
	@GetMapping("/getProjects")
	public @ResponseBody List getProjectList() {
		return projectservice.getAllProjects();
	}
	@GetMapping("/getProjectsByID")
	public @ResponseBody List getProjectListByID(int id) {
		return projectservice.getAllProjectsByID(id);
	}
	
	@GetMapping("/projectListPageload")
	public String projectlistShow()
	{
		return "/module/user/projectlist";
	}
	@GetMapping("/projectPageload")
	public String projectAdd()
	{
		return "/module/user/projectadd";
	}
	
	@PostMapping("/saveProject/{userName}")
	public @ResponseBody void saveProject(@RequestBody Projects p , @PathVariable String userName) 
	{
		User userdetails = userService.getUserByUserName(userName);
		p.setCreationDate(DateUtility.getCurrentDateWithTime());
		projectservice.saveOrUpdate(p);
		
	}
	
}
