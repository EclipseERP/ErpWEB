package com.ets.csm.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ets.csm.model.Cake;
import com.ets.csm.model.CakeImage;
import com.ets.csm.model.Calender;
import com.ets.csm.model.CupCake_Email_Template;
import com.ets.csm.model.Customer;
import com.ets.csm.model.Email_Template_For_User;
import com.ets.csm.model.SendMails;
import com.ets.csm.model.User;
import com.ets.csm.repository.CustomerRepository;
import com.ets.csm.service.CustomerService;
import com.ets.csm.service.CustomerServiceImpl;
import com.ets.csm.service.EmailTemplateService;
import com.ets.csm.service.OrderManageService;
import com.ets.csm.service.UserService;
import com.ets.csm.util.Calendar_Data;
import com.ets.csm.util.DateUtility;
import com.ets.csm.util.MailFire_Tool;

/**
 * @author Pradipto Roy (SR.Java Developer)
 *
*/

@Controller
@RequestMapping("/emailtemplate")
public class Email_Template_Controller 
{
	
@Autowired
private EmailTemplateService eTemplateservice;

@Autowired
UserService userService;

@Autowired
OrderManageService orderManageService;

@Autowired
CustomerService custservice;
	
	
//############################################## Load Email Template form in Super admin account  ###################################### 
@GetMapping("/load_email_template")
public ModelAndView load_email_template()
{
ModelAndView mod=new ModelAndView();	
mod.setViewName("/module/admin/emailTemplate");	
return mod;
}

//############################################## Load All Email Templates   #############################################################
@GetMapping("/loadEmailTemplates")
public @ResponseBody List loadEmailTemplates()
{
	return eTemplateservice.getAllEmailTemplatesInSuperadmin();
}

//############################################## Update Email Template   #################################################################
@PostMapping("/updateEmilContents")
public @ResponseBody void updateEmailContents(HttpServletRequest request ) {
	
	
	System.out.println("id found..."+request.getParameter("id"));
	
	
	CupCake_Email_Template c=(CupCake_Email_Template) eTemplateservice.getEmailContentByID(Integer.parseInt(request.getParameter("id"))).get(0);
	c.setTempcontent(request.getParameter("emailcontent").toString());
    c.setTempheading(request.getParameter("tempheading").toString());
	eTemplateservice.saveEmailContent(c);
}



//############################################## Load Email Template form user account  ################################################## 
@GetMapping("/call_email_template_for_user")
public ModelAndView call_email_template_for_user()
{	
ModelAndView mod=new ModelAndView();	
mod.setViewName("/module/user/emailTemplateForUser");	
return mod;
}

//############################################## Load All Email Templates for user    #######################################################
//--- Method check that if email template are not available in user account then it will fetch all default emails templates from superadmin account.
//----Once the email template fetch in user account then second time process block fetching the same for super admin account----------------
//###########################################################################################################################################

@GetMapping("/loadEmailTemaplatesForUser/{username}")
public @ResponseBody List loadEmailTemaplatesForUser(@PathVariable String username)
{

	return CheckerFlag_EmailTemplates(username);
}
@SuppressWarnings("rawtypes")

public List CheckerFlag_EmailTemplates(String username)
{
	List returndata=new ArrayList();
	
	List userTemplateList=eTemplateservice.getEmailContentforUserByUserName(username);
	
	if(userTemplateList.size()>0)
	{  
	
	returndata=userTemplateList;
	
	}
	else
	{
    List superadmintemplist=eTemplateservice.getAllEmailTemplatesInSuperadmin();
    @SuppressWarnings("unchecked")
	List<Object[]> results = superadmintemplist;
	for(int k=0;k<results.size();k++)
	{
		Object result=results.get(k);
		CupCake_Email_Template senddata=(CupCake_Email_Template)result;
		Email_Template_For_User euser=new Email_Template_For_User();
	    euser.setEventheader(senddata.getTempheading());
	    euser.setEventname(senddata.getEventtype());
	    euser.setStatus(1);
	    euser.setTempcontent(senddata.getTempcontent());
	    euser.setUser(userService.getUserByUserName(username));
	    eTemplateservice.saveEmailTemplateForuser(euser);
    }
	
	List userTemplateList_secondFetch=eTemplateservice.getEmailContentforUserByUserName(username);
	returndata=userTemplateList_secondFetch;		
	}
	
	return returndata;
}

//############################## Email Template Update for User account ###########################################################################
@PostMapping("/updateTemplateTableForUser")
public @ResponseBody void updateTemplateTableForUser(HttpServletRequest request) 
{
	
Email_Template_For_User eus=(Email_Template_For_User) eTemplateservice.getEmailTemplateUserById(Integer.parseInt(request.getParameter("id"))).get(0);
eus.setEventheader(request.getParameter("tempheading"));
eus.setTempcontent(request.getParameter("emailcontent"));
eTemplateservice.saveEmailTemplateForuser(eus);

}

//############################################## Email compose form load  ########################################################################## 
@GetMapping("/emailComposeFormLoad")
public ModelAndView emailComposeFormLoad()
{	

ModelAndView mod=new ModelAndView();	
mod.setViewName("/module/user/emailComposeFormLoad");	
return mod;
}


//############################################## Email SENDing process  ########################################################################## 
@PostMapping("/sendEmailToClients")
public @ResponseBody void sendEmailToClients(@RequestParam("id") String emailid,
	@RequestParam("cc") String cc,
	@RequestParam("subjectid") String subject,
	@RequestParam("content") String emailtempdata,@RequestParam("username") String username )throws IOException, ParseException 
{
	  if(MailFire_Tool.EmailSender(emailid, cc, subject, emailtempdata)>0)
	  {
      for(int i=0;i<emailid.split(",").length;i++)
      {	
    	  
       System.out.println("One mail send..");
       SendMails senddata=new SendMails();
       senddata.setUser(userService.getUserByUserName(username));
       senddata.setCcmail(cc);
       senddata.setToemailid(emailid.split(",")[i]);
       senddata.setSubject(subject);
       senddata.setMailcontent(emailtempdata);
       senddata.setDatetime(DateUtility.getDate());
       senddata.setCustomer(custservice.getCustomerBYEmail(emailid.split(",")[i]));
       eTemplateservice.saveSendMail(senddata);
       
      }
 
      }
}

//############################################## Get Send Mails  ########################################################################## 
@GetMapping("/getSendMails/{username}")
public @ResponseBody List getSendMails(@PathVariable String username)
{
	return eTemplateservice.getSendMailsByUserName(username);
}


}