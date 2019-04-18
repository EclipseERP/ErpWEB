package com.ets.csm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ets.csm.model.SocialProfiles;
import com.ets.csm.model.SuperAdminHelpSetting;
import com.ets.csm.model.User;
import com.ets.csm.service.UserService;
import com.ets.csm.util.DefaultHelpSettingsLoader;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	
	
	
	
	
	@Autowired
	private UserService delObj;
	
	/*@Autowired
	private UserService userService;
	*/

	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String adminM() {
		
		return "/module/admin/admin";
	
	}
	
	@GetMapping("/dashboard")
	public String dashboard() {
		
		return "/module/admin/adminDashboard";
	
	}
	
	@GetMapping("/userManagement")
	public String userManagementAction() {
		return "/module/admin/userManagement";
	}
	
	@RequestMapping("/editUserModal")
	public String editUserModalAction() {
		return "/module/admin/editUserModal";
	}
	
	@GetMapping("/getUserData")
	public @ResponseBody List getUserByRole() {
	
	return userService.getUserByRole();

	}
	
	@GetMapping("/subscription")
	public String subscriptionAction() {
		
		 return "/module/admin/subscriptionManagement";
		
	}
	
	/**to edit  of user**/
	@PostMapping("/updateUser/{userName}/{firstName}/{lastName}/{phnNo}/{email}/{address}/{city}/{country}")
	public @ResponseBody Object updateUser(@PathVariable String userName, @PathVariable String firstName, @PathVariable String lastName, @PathVariable String phnNo, @PathVariable String email, @PathVariable String address, @PathVariable String city, @PathVariable String country) {
		//System.out.println("JKJSKJAKSJAKJ");
		 User user = userService.getUserByUserName(userName);
	     //user.setActive(actveStat);
	     user.setFirstName(firstName);
	     user.setLastName(lastName);
	     user.setPhone(phnNo);
	     user.setEmail(email);
	     user.setAddress(address);
	     user.setCity(city);
	     user.setCountry(country);
	     userService.saveOrUpdate(user);
		 return user;
		}
	
	
	
	/**to edit version of user**/
	@PostMapping("/updateUserVersion/{userName}/{version}")
	public @ResponseBody Object updateUserVersion(@PathVariable String userName, @PathVariable String version) {
		 
		//System.out.println("JKJSKJAKSJAKJ");
		
		User user = userService.getUserByUserName(userName);
	     user.setVersion(version);
	      userService.saveOrUpdate(user);
		  return user;
		}
	
	/**to edit emailAccess of user**/
	@PostMapping("/updateUserEmail/{userName}/{emailAcc}")
	public @ResponseBody Object updateUserEmailFac(@PathVariable String userName, @PathVariable String emailAcc) {
		 
		System.out.println("Email Change");
		
		User user = userService.getUserByUserName(userName);
	     user.setEmailFac(emailAcc);
	      userService.saveOrUpdate(user);
		  return user;
		}
	
	/**to edit cupCake of user**/
	@PostMapping("/updateUserCupcake/{userName}/{cupCake}")
	public @ResponseBody Object updateUserCupCake(@PathVariable String userName, @PathVariable String cupCake) {
		 
		System.out.println("CupCake controller");
		
		User user = userService.getUserByUserName(userName);
	     user.setCupCake(cupCake);
	      userService.saveOrUpdate(user);
		  return user;
		}
	
	
	/**to edit status of user**/
	@PostMapping("/updateUserStat/{userName}/{actveStat}")
	public @ResponseBody Object updateUserStat(@PathVariable String userName, @PathVariable int actveStat) {
		 
		//System.out.println("JKJSKJAKSJAKJ");
		
		User user = userService.getUserByUserName(userName);
	     user.setActive(actveStat);
	      userService.saveOrUpdate(user);
		  return user;
		}
	
	@GetMapping("/delUserdeatils/{userName}")
	 public @ResponseBody Object delProLogByApptNum(@PathVariable String userName) {
	  System.out.println(userName+" *");
	  User userdetails = userService.getUserByUserName(userName);
	  
	    System.out.println(userdetails.getUserName());
	  userService.remove(userdetails);
	  return userdetails;
	 }
	
	@GetMapping("/allAdminDetails/{username}")
	public @ResponseBody User allDetails(@PathVariable String username){
		return userService.getAllUserDetails(username);
	}
	
	
	@GetMapping("/admin_profile_load")
	public String adminprofileLoad() {
	System.out.println("called");	
	return "/module/admin/profile";
	}
	
	@PostMapping("/updateAdminDetails/{username}")
	public @ResponseBody void updateUserDetails(@PathVariable String username, @RequestBody User user){

		 userService.updateUserDetails(user.getUserName(), user.getEmail(), user.getId());
		 
	}
	
	@GetMapping("/change_password_display")
	public ModelAndView changePasswordLoad()
	{
	ModelAndView mod=new ModelAndView();	
	mod.setViewName("/module/admin/changepassword");	
	return mod;
	}
	
	@GetMapping("/mailbodyLoad")
	public ModelAndView getMailBodyLoad()
	{
		ModelAndView mod=new ModelAndView();	
		mod.setViewName("/module/admin/mailBodyContent");	
		return mod;

	}
	
	@GetMapping("/getALLHelpSettingDetail/{username}") 
	 public @ResponseBody List getSignUpMessage(@PathVariable String username) {
		List<SuperAdminHelpSetting> settinglist = userService.getSuperAdminHelpSettings(username);
	    User user = userService.getAllUserDetails(username);
		if(settinglist.size()==0)
		{
		for(SuperAdminHelpSetting s:DefaultHelpSettingsLoader.getDefaultHelpSettings(user))	
		{
		userService.saveSuperadminHelpSetting(s);	
		}
	    settinglist = userService.getSuperAdminHelpSettings(username);
		}
		
	    return settinglist;

	 }


	@SuppressWarnings("unchecked")
	@PostMapping("/updateALLHelpSettingDetail")
	public  @ResponseBody void updateALLHelpSettingDetail(
			@RequestParam(name="id") int id,
			@RequestParam(name="settinghead") String settingheader,
			@RequestParam(name="headercont") String headercont
		
			) {	
	
		List<SuperAdminHelpSetting> settinglist=userService.getHelpSettingsById(id);

		for(SuperAdminHelpSetting s:settinglist)
		{
			s.setSettingheader(settingheader);
			s.setSettingcontent(headercont);
			userService.saveSuperadminHelpSetting(s);
		}
		
	 System.out.println(id);

//	 userService.updateHelpSetting(id, settingheader, headercont);
	}
	
	@PostMapping("/updateUserDetailsFromSuperAdmin/{username}")
	public @ResponseBody void updateUserDetailsFromSuperAdmin(@PathVariable String username,
		   @RequestParam(name="fname") String fname,
		   @RequestParam(name="lname") String lname,
		   @RequestParam(name="phoneno") String phonenumber,
		   @RequestParam(name="emailid") String emailid,
		   @RequestParam(name="address") String address,
		   @RequestParam(name="city") String city,
		   @RequestParam(name="country") String country,
		   @RequestParam(name="id") long id
			){
		
		System.out.println(" mthod called");
		User  user= userService.getUserByRowId(id);
		
		user.setFirstName(fname);
		user.setLastName(lname);
		user.setPhone(phonenumber+"");
		user.setEmail(emailid);
		user.setAddress(address);
		user.setCity(city);
		user.setCountry(country);

	userService.saveOrUpdate(user);
	}
}
