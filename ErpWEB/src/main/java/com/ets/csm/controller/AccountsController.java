package com.ets.csm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ets.csm.service.AccountsService;
import com.ets.csm.service.ProjectsService;
import com.ets.csm.service.UserService;

@Controller
@RequestMapping("/accounts")
public class AccountsController {
	@Autowired
	AccountsService accountsService;
	
	@Autowired
	ProjectsService projectservice;
	
	@GetMapping("/")
	public String accounts() {
		
		return "/module/accounts/accountsParrent";
	
	}
	
	@GetMapping("/dashboard")
	public String dashboard() {
		
		return "/module/accounts/dashboard";
	
	}
	
	
	@GetMapping("/accountsListPageload")
	public String projectlistShow() {
		return "/module/user/turnoverList";
	}
	
	
	
	
	@GetMapping("/getProjectDetailsForTurnoverPageGroupByProjectCode")
	public @ResponseBody List getProjectDetailsGroupByProjectCode() {

		return projectservice.getProjectGroupByProjectCode();

	}
	
	
	
	
	
	
	

}
