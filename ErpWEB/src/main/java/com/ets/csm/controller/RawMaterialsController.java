package com.ets.csm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
=======
import org.springframework.web.bind.annotation.ResponseBody;

import com.ets.csm.model.RawMaterials;
import com.ets.csm.model.User;
import com.ets.csm.service.RawMaterialsService;
import com.ets.csm.service.UserService;
>>>>>>> branch 'master' of https://github.com/EclipseERP/ErpWEB.git

import com.ets.csm.model.Calender;
import com.ets.csm.model.Referral;
import com.ets.csm.model.User;
import com.ets.csm.service.UserService;
import com.ets.csm.service.RawMaterialsService;
import com.ets.csm.util.DateUtility;
import com.ets.csm.model.RawMaterials;
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
	

	
	@Autowired
	RawMaterialsService itemService;
	@Autowired
	UserService userService;
	
	@PostMapping("/addItemFormData/{userName}")
	public @ResponseBody void addItemFormData(@RequestBody RawMaterials itemData, @PathVariable String userName) {
		User user = userService.getUserByUserName(userName);
		itemData.setUser(user);
		itemService.saveOrUpdate(itemData);
	}
	
}
