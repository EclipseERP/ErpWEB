package com.ets.csm.controller;

import java.io.BufferedOutputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.MultipartConfigElement;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.servlet.ModelAndView;
import com.ets.csm.model.CompanyDetails;
import com.ets.csm.model.Localization;
import com.ets.csm.model.SettingsMaster;
import com.ets.csm.model.SocialProfiles;
import com.ets.csm.model.SuperAdminHelpSetting;
import com.ets.csm.model.UnitConversion;
import com.ets.csm.service.UserService;
import com.ets.csm.util.DateUtility;
import com.ets.csm.util.DefaultSettingsLoader;

@Controller
@RequestMapping("/userInit")
public class UserinitController 
{
	
	@Autowired
	UserService userService;
	
	@Autowired
	  private Environment env;

	@GetMapping("/getCurrentUser")
	public @ResponseBody Object customersByUserId() {
		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String userName = user.getUsername();
		return userService.getUserByUserName(userName);
	}
	
	@GetMapping("/getCurrentUserTheme")
	public @ResponseBody List getCurrentUserTheme() {
		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String userName = user.getUsername();
		return userService.getCurrentUserTheme(userName);
	}
	

	@GetMapping("/getCompanyDetailsByUsername/{username}")
	public @ResponseBody CompanyDetails getCompanyDetails(@PathVariable("username") String username)
	{
		return userService.getCompanyInfoByUsername(username);
	}
	
	@GetMapping("/loadCompanyDetailsForm")
	public ModelAndView loadAppointMent()
	{
	ModelAndView mod=new ModelAndView();	
	mod.setViewName("/module/user/companyDetailsForm");	
	return mod;
	}
	
	@PostMapping("/updateCompanyInformation/{username}")
	public @ResponseBody void updateCompanyDetails(@RequestBody CompanyDetails comp,@PathVariable("username") String username,@RequestParam("countryid") int countryid)
	{
        comp.setUser(userService.getUserByUserName(username));
        comp.setCountry_id(countryid);
        if(comp.getLogo()==null)
        {
         comp.setLogo("Not Updated");
        }
		userService.saveCompanyInfoOrUpdate(comp);
	}
	
	@GetMapping("/getCountryDetails")
	public @ResponseBody List getCountryDetails()
	{
		return userService.getCountry();
	}
	
	@GetMapping("/getCountryDetailsByCountryname/{countryid}")
	public @ResponseBody List getCountryDetailsByUsername(@PathVariable("countryid") Integer countryid)
	{
		return userService.getCountryByCountryCode(countryid);
	}
	
	@GetMapping("/loadotherSettingsForm")
	public ModelAndView otherSettingsForm()
	{
	ModelAndView mod=new ModelAndView();	
	mod.setViewName("/module/user/otherDetailsSettings");	
	return mod;
	}
	
	@GetMapping("/getSettingDetails/{username}")
	public @ResponseBody List getSettingDetailsByUsername(@PathVariable("username") String username)
	{
		List returSettings=new ArrayList();
		returSettings=userService.getSettingMasterDetails(username);
		com.ets.csm.model.User userdata=userService.getUserByUserName(username);
		if(returSettings.size()==0)
		{
		returSettings.clear();	
		userService.saveAllSettings(DefaultSettingsLoader.getDefaultSettings(userdata));
		returSettings=userService.getSettingMasterDetails(username);
		}
		
		return returSettings;
	}

	@PostMapping("/updateSettingDetails/{id}")
	public @ResponseBody void updateSettingDetails(@PathVariable("id") int id,@RequestParam("description") String description )
	{
		SettingsMaster s=userService.getSettingMsterDetailsbyId(id);
		s.setDescription(description);
		userService.saveOrUpdate(s);
	}
	
	 @PostMapping("/updateFinancialSettingDetails/{username}")
	 public @ResponseBody void updateFinancialSettingDetails(@PathVariable("username") String username,
	 @RequestParam("settingtitle") String[] settingsTitle,@RequestParam("settingData") String[] settingsData)
	{

	System.out.println(settingsTitle.length);		
	List settinglist=userService.getSettingMasterDetails(username)	;	
	List<Object[]> results = settinglist;
	for(int k=0;k<results.size();k++)
	{
		Object result=results.get(k);
		SettingsMaster s=(SettingsMaster)result;
		for(int l=0;l<settingsTitle.length;l++)
		{
	    if(s.getTitle().equalsIgnoreCase(settingsTitle[l]))	
		{
			s.setValue(settingsData[l]);
			userService.saveOrUpdate(s);
		}
		}	
	}	
	}
		@GetMapping("/converstionToolLoad")
		public ModelAndView converstionToolLoad()
		{
		ModelAndView mod=new ModelAndView();	
		mod.setViewName("/module/user/converstionToolLoad");	
		return mod;
		}

		@GetMapping("/getConvertionData/{username}")
		public @ResponseBody List getConvertionToolData(@PathVariable("username") String username)
		{
			return userService.getConversionTooldata(username);
		}
		
		@PostMapping("/unitconversionsave/{username}")
		public @ResponseBody void unitconversionsave(@RequestBody UnitConversion comp,@PathVariable("username") String username)
		{
	        comp.setUser(userService.getUserByUserName(username));
			userService.saveOrUpdate(comp);
		}
		
		@GetMapping("/getConvertionDataById/{id}")
		public @ResponseBody UnitConversion getConvertionDataById(@PathVariable("id") Integer id)
		{
			return userService.getUnitConversionDataById(id);
		}
		
		@GetMapping("/loadSocialSettingPage")
		public ModelAndView loadSocialSettingPage()
		{
		ModelAndView mod=new ModelAndView();	
		mod.setViewName("/module/user/socialSettingPage");	
		return mod;
		}
		
		
		@GetMapping("/getSocialLoadingPage/{username}")
		public @ResponseBody List getSocialLoadingPage(@PathVariable("username") String username)
		{
			return userService.getSocialDataByUsername(username);
		}
		
		@GetMapping("/getUserDetailsByEmail/{email}")
		public @ResponseBody boolean userDetailsByEmail(@PathVariable String email) 
		{
			int size=userService.getUserDataByEmail_Validate(email.trim()).size();
			System.out.println("Size found "+size);
			
			if(size>0)
			{
				 return true; 
			}
			else
			{
				return false; 
			}

		}
		
		@PostMapping("/getUserDetailsByEmail_list/{email}")
		public @ResponseBody List userDetailsByEmail_list(@PathVariable String email) {
				
		return userService.getUserDataByEmail_Validate(email.trim());
		}
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		@PostMapping("/getUserDetailsByUsername")
		public @ResponseBody List userDetailsByUserName(@RequestParam(name = "email") String email) {
		List userlist=new ArrayList();
    	List<com.ets.csm.model.User> userdata=new ArrayList<com.ets.csm.model.User>();
		
	    if(email.contains("@")) 
	     {
	    	 System.out.print("emailtype"); 
	    	 userdata=userService.getUserDataByID(email);
	     }else
	     {
	    	 com.ets.csm.model.User user=userService.getUserByUserName(email);
	    	 userdata.add(user);
	    	 System.out.print("usernametype");  ;
	     }
	        
		return userdata;
		}
		
		@GetMapping("/change_password_display")
		public ModelAndView changePasswordLoad()
		{
		System.out.println("called")	;
			
		ModelAndView mod=new ModelAndView();	
		mod.setViewName("/module/user/changePasswordUser");	
		return mod;
		}
		
		@GetMapping("/user_social_media_load")
		public ModelAndView usersocialmediaload()
		{
			
		ModelAndView mod=new ModelAndView();	
		mod.setViewName("/module/user/addSocialMedia");	
		return mod;
		}
		
		@GetMapping("/settingHelData/{username}")
		public @ResponseBody List settingHelpData(@PathVariable("username")String username)
		{
			
		 List setingdata=userService.getActiveUser();
		 if(setingdata.size()==0)
		 {

		 }
			return setingdata;
		}
		
		
		
		/*@GetMapping("/user_social_media_load")
		public ModelAndView usersocialmediaload()
		{
			
		ModelAndView mod=new ModelAndView();	
		mod.setViewName("/module/user/addSocialMedia");	
		return mod;
		}*/
		
		@PostMapping("/updateOrSaveSocialSetting/{username}")
		public @ResponseBody void updateOrSaveSocialSetting( @RequestBody SocialProfiles social,@PathVariable String username) {
		
		com.ets.csm.model.User user=	userService.getUserByUserName(username);
		social.setUser(user);
		social.setCreated_at(DateUtility.getCurrentDateWithTime());
		social.setUpdate_at(DateUtility.getCurrentDateWithTime());
			
		 userService.addSocialProfile(social);
		}
		

		
		@GetMapping("/manageLogo")
		public String manageLogoLoad() {
		return "/module/user/manageLogo";
		
		}
		
		
		@PostMapping("/updateOrSaveLocalization/{username}")
		public @ResponseBody void updateOrSaveLocalization( @RequestBody Localization localization,@PathVariable String username) {
		
		com.ets.csm.model.User user=	userService.getUserByUserName(username);
		localization.setUser(user);
		localization.setCreatedDate(DateUtility.getCurrentDateWithTime());
		localization.setTimeHeader("Localization");	
		userService.saveLocalization(localization);
		}
		
		@GetMapping("/getLocalizationData/{username}")
		public @ResponseBody List getLocalizationData(@PathVariable("username") String username)
		{
			return userService.getAllLocalizationBYUserid(username);
		}

		@GetMapping("/gethelpSettingData/{settingname}")
		public @ResponseBody SuperAdminHelpSetting gethelpSettingData(@PathVariable("settingname") String settingname)
		{
			return userService.getSettingDataByName(settingname);
		}
		
		
		
		//+++++++++++++++++++++++++++++++++++ Logo upload Method+++++++++++++++++++++++++++++++++++++++++
		
		@PostMapping(value ="/uploadLogoFile" )
		
//		public @ResponseBody String doUpload()
		
		public @ResponseBody String doUpload(@RequestParam("files") MultipartFile file) 
		{                 
		   
			System.out.println("callled .. ");
			
			return "";
		}
		

	  //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
		
		
		@GetMapping("/checkCupCakeModulePermission/{username}")
		public @ResponseBody boolean checkCupCakeModulePermission(@PathVariable("username") String username)
		{
			
			com.ets.csm.model.User userdetails=userService.getUserByUserName(username);
			
			if(userdetails.getCupCake().equalsIgnoreCase("Yes"))
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		
		@GetMapping("/checkEmailModulePermission/{username}")
		public @ResponseBody boolean checkEmailCupCakeModulePermission(@PathVariable("username") String username)
		{
			
			com.ets.csm.model.User userdetails=userService.getUserByUserName(username);
			
			if(userdetails.getEmailFac().equalsIgnoreCase("Yes"))
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
}
