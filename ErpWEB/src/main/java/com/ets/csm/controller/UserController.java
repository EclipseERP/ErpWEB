package com.ets.csm.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ets.csm.model.Subscription;
import com.ets.csm.model.User;
import com.ets.csm.service.ReferralService;
import com.ets.csm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String user() {
	return "/module/user/user";
	}
	
	@GetMapping("/dashboard")
	public String dashboard() {
	return "/module/user/dashboard";
	
	}
	
	@GetMapping("/user_profile_load")
	public String userprofileLoad() {
	return "/module/user/userProfile";
	
	}
	
	@GetMapping("/allUserDetails/{username}")
	public @ResponseBody User allReferrals(@PathVariable String username){
		return userService.getAllUserDetails(username);
	}
	
	
	@PostMapping("/updateUserDetails/{username}")
	public @ResponseBody void updateUserDetails(@PathVariable String username, @RequestBody User user){
	userService.updateUserDetails(user.getUserName(), user.getEmail(), user.getId());
	}
	
	



}
