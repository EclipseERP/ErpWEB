package com.ets.csm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ets.csm.model.Theme;
import com.ets.csm.model.User;
import com.ets.csm.service.ThemeSettingService;
import com.ets.csm.service.UserService;

/**
 * @author Pradipto Roy 
 *
 */
@Controller
@RequestMapping("/theme_settings")
public class ThemeSettingController {
  
	@Autowired
	ThemeSettingService themeservice;
	
	@Autowired
	UserService userService;
	
//######################## This method will return all theme list from table #########################################	
	@GetMapping("/getThemeList")
	public @ResponseBody List getThemeList() {
		return themeservice.getAllTheme();
	}
	
//############################################## Load theme page ########################################################################## 
	@GetMapping("/themeLoad")
	public ModelAndView theme_page_load()
	{	

	ModelAndView mod=new ModelAndView();	
	mod.setViewName("/module/user/ThemeSettingLoad");	
	return mod;
	}
//############################################## Get Theme data by theme id ##########################################################################	
	@GetMapping("/themedata/{themeid}")
	public @ResponseBody List getThemeDataBythemeId(@PathVariable int themeid)
	{
		List object=new ArrayList();
		object.add(themeservice.getThemeDataByThemeId(themeid))	;	

		return object;
	}
	
	@PostMapping("/updateThemeByThemeId/{id}")
	public @ResponseBody  void updateThemeIdinUserAccount(@PathVariable("id") int id, @RequestParam("username") String username)
	{
	User user = userService.getUserByUserName(username);	
	user.setThid(id);
	userService.saveOrUpdate(user);
		
	}
	
	
		
}
