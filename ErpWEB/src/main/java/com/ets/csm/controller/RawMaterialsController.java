package com.ets.csm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ets.csm.model.RawMaterials;
import com.ets.csm.model.User;
import com.ets.csm.service.RawMaterialsService;
import com.ets.csm.service.UserService;

@Controller
@RequestMapping("/rawMaterials")
public class RawMaterialsController {
	@Autowired
	UserService userService;
	
	@Autowired
	RawMaterialsService rawservice;
	 
	@PostMapping("/saveRawMaterial/{userName}")
	public @ResponseBody void saveUser(@RequestBody RawMaterials raw , @PathVariable String userName) 
	{
		User userdetails = userService.getUserByUserName(userName);
		
		raw.setUser(userdetails);
		
		rawservice.saveItemData(raw);
		
	}
	

	
	
	
	
	
	
	
}
