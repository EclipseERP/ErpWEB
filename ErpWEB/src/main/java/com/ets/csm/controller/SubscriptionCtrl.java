package com.ets.csm.controller;


//import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
//github.com/EclipseERP/ErpWEB.git

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ets.csm.model.Role;
import com.ets.csm.model.Subscription;
import com.ets.csm.model.SuperAdminHelpSetting;
import com.ets.csm.model.User;
import com.ets.csm.service.RoleService;
import com.ets.csm.service.SubscriptionService;
import com.ets.csm.service.UserService;
import com.ets.csm.util.AdminAccountTempTool;
import com.ets.csm.util.MailFire_Tool;

@Controller
@RequestMapping("/subs")
public class SubscriptionCtrl {
	@Autowired
	RoleService roleService;
	@Autowired
	UserService userService;
	@Autowired
	private SubscriptionService subscriptionService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@GetMapping("/view")
	public @ResponseBody List subscription() {
		
		return  subscriptionService.getAll();
	
	}
	
	@PostMapping("/save")
	public @ResponseBody int saveUser(@RequestBody User user) {
		
		int returresult=0;
		
		Set roleSet = new HashSet<>();
		Role userRole = new Role();
	    userRole.setRole("ROLE_USER");
		roleService.add(userRole);
		
		   Set<Role> userRole1= roleService.getRoleByID(userRole.getId());
		
		   if(user.getId()!=null) { //update
		
		   }else {//save

				int size=userService.getUserDataByEmail_Validate(user.getEmail().trim()).size();
				System.out.println("Size found "+size);
				
				if(size>0)
				{
					returresult=1;
				}
				else
				{
					 user.setRoles(userRole1);
					 user.setPassword(passwordEncoder.encode(user.getPassword()));
					 user.setThid(9);
					 user.setPaymentPendingStatus("0");
					 user.setCupCake("No");
					 user.setEmailFac("No");
					 user.setVersion("Basic");
					 user.setCountry("No data");
					 Long i= userService.saveOrUpdate(user).getId();
					 if(i>0)
					 {
						 
					 SuperAdminHelpSetting settingdata=userService.getSettingDataByName("signupsucessfully");	  
					 String subject="Mail from CakeShop" ;
					 String content="Hi "+user.getFirstName()+" "+user.getLastName()+" \n"+settingdata.getSettingcontent()+"\n";
					 
					 MailFire_Tool.EmailSender(user.getEmail(), "", subject, content);	   
					 }
				}
		
		}
		   
		   return returresult;
	}

	//For SignUp page
			@RequestMapping(value="/enableUser/{userName}/{startDate}/{endDate}/{amount}/{cSubsPlan}/{subsName}/{email}/{enable}/{version}/{emailFac}/{cupCake}", method=RequestMethod.POST)
			public @ResponseBody Object enableUser(@PathVariable String userName, @PathVariable String startDate, @PathVariable String endDate, @PathVariable int amount, @PathVariable int cSubsPlan, @PathVariable String subsName,@PathVariable String email,@PathVariable int enable,@PathVariable String version,@PathVariable String emailFac,@PathVariable String cupCake) throws ParseException {
				   
		      Date sDate= new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
			  Date eDate= new SimpleDateFormat("yyyy-MM-dd").parse(endDate);
				
			  User userdetails = userService.getUserByUserName(userName);
		      userdetails.setJoinDate(new java.sql.Date(sDate.getTime()));
		      userdetails.setEndDate(new java.sql.Date(eDate.getTime()));
		      userdetails.setActive(enable);
		      userdetails.setSubs_cost(amount);
		      userdetails.setSubs_months(cSubsPlan);
		      userdetails.setSubs_name(subsName);
		      userdetails.setEmailFac(emailFac);
		      userdetails.setCupCake(cupCake);
		      userdetails.setVersion(version);
		      userdetails.setPaymentPendingStatus("1");
		      Long i=  userService.saveOrUpdate(userdetails).getId();
		      
		      
		 	 if(i>0)
			 {
		 	 SuperAdminHelpSetting settingdataforAdmin=userService.getSettingDataByName("paymentsuccessfull_for_user");	
		 	 String subject="Mail from CakeShop" ;
			 String content="Hi "+userdetails.getFirstName()+" "+userdetails.getLastName()+" \n"+settingdataforAdmin.getSettingcontent()+"\n"
			 + " ";
			 MailFire_Tool.EmailSender(userdetails.getEmail(), "", subject, content);	   
			 SuperAdminHelpSetting settingdataforsuperadmin=userService.getSettingDataByName("paymentsuccessfull_for_admin");	
			 content="Hi \n Payment received from "+userdetails.getFirstName()+" "+userdetails.getLastName()+". \n Payment Details are as follows : \n Subcription type : "+subsName+"\n Amount paid :"+amount
			 + " ";
			 MailFire_Tool.EmailSender(AdminAccountTempTool.getSuperAdminDetails().trim(), "", subject, content);	   
			 
			 }
		      
			  return userdetails;
			}
			
			@GetMapping("/getUserByUserName/{userName}")
			public @ResponseBody boolean viewSubs(@PathVariable String userName) {
				
				User user = userService.getUserByUserName(userName);
			      if(user!=null) {
			    	 return true; 
			      }else {
			    	 return false; 
			    	  
			      }
			}

	@PostMapping("/saveSubsc")
	public @ResponseBody void saveSubscription(@RequestBody Subscription subsc) {
		subscriptionService.saveSubscription(subsc);
	}
	
	@PostMapping("/update")
	public @ResponseBody void updateSubscription(@RequestBody Subscription subsc) {
		System.out.println(subsc.getId());
	
		subscriptionService.saveOrUpdate(subsc);
	}
	
	@PostMapping("/delSubs")
	public @ResponseBody void deleteSubscription(@RequestBody Subscription subsc) {
		subscriptionService.remove(subsc);
		//return  subscriptionService.getAll();
		//return subsc;
	}

}
