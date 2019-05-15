package com.ets.csm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/accounts")
public class AccountsController {
	
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
	
	
	

}
