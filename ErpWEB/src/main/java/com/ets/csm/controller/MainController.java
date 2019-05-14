package com.ets.csm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ets.csm.model.User;
import com.ets.csm.service.UserService;

@Controller
public class MainController {
	
	 @Autowired
	 private PasswordEncoder passwordEncoder;
	 @Autowired
	 private UserService userservice;
	
	   @RequestMapping("/default")
	    public  ModelAndView defaultAfterLogin(HttpServletRequest request) {
			 
		   System.out.println("USER_ROLE"+request.isUserInRole("ROLE_ADMIN"));
			    ModelAndView mav = new ModelAndView();
			    mav.addObject("invalidLogin", "");
		        if (request.isUserInRole("ROLE_ADMIN")) {
		        	
		        	mav.setViewName("redirect:/accounts/");
		        }
		        else if(request.isUserInRole("ROLE_USER"))
		        {
		        	
		        	System.out.println("user found");
		        	mav.setViewName("redirect:/user/");
		           
		        }else 
		        	mav.setViewName("Access is not Defined");
		         return mav;
		    }
	 
	 
	@GetMapping({"/login","/"})
	  public ModelAndView showLogin(HttpServletRequest request) {
	    ModelAndView mav = new ModelAndView();

	    mav.addObject("invalidLogin", "<b style=color:red>Invalid login credentials entered </b>");
	    
	    
	    
	    mav.setViewName("/login");
	    return mav;

	  }
	
	@RequestMapping("/loginValidation")
	public @ResponseBody String loginValidations(@RequestParam("email") String email, @RequestParam("password") String password)
	{
		int i=0;
		try {
			List<User> userdata=new ArrayList<User>();
			     if(email.contains("@")) 
			     {
			    	 System.out.print("emailtype"); 
			    	 userdata=userservice.getUserDataByID(email);
			     }else
			     {
			    	 User user=userservice.getUserByUserName(email);
			    	 userdata.add(user);
			    	 System.out.print("usernametype");  ;
			     }

			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			if (passwordEncoder.matches(password, userdata.get(0).getPassword())) {
				
				for(User u:userdata)
				{
					if(userservice.getUserDataByEmailOnlyActive(u.getEmail()).size()>0)
					{
						i=1;
						
					}
					else
					{
						i=2;
					}
				}
				
			} 
	
		}
		catch(Exception n)
		{
			i=0;
		}

		return i+"";
	}

	@GetMapping("/home")
	public String homePage() {
		return "/homePage";
	}
	 @GetMapping("/access-denied")
	 public String accessDenied(){
		
	 return "access-denied";
	 }
	 
		@RequestMapping("/userPasswordChanage")
		
		public  @ResponseBody String userPasswordChanageValidation(@RequestParam("username") String username, 
				@RequestParam("currentpassword") String currentpassword,
				@RequestParam("newpassword") String newpassword)
		
	            {	
			int i=0;
			try {

				User userdata=userservice.getUserByUserName(username);
				BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
				if (passwordEncoder.matches(currentpassword, userdata.getPassword()))
				{			
				userdata.setPassword(passwordEncoder.encode(newpassword));	
				userservice.saveOrUpdate(userdata);
				}
				else
				{
					i=1;
				}
					
			}
			catch(Exception n)
			{
				i=0;
			}

			return i+"";
		}
		
		   @RequestMapping("/logout")
		    public  ModelAndView logout(HttpServletRequest request) {
			   ModelAndView mav = new ModelAndView(); 

			    HttpSession session= request.getSession(false);
		        SecurityContextHolder.clearContext();
		        if(session != null) 
		        {
		        session.invalidate();
		        }
			   
			   mav.setViewName("/login");
			   return mav;
			    
		   }
}
