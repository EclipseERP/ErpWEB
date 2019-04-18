package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.CupCake_Email_Template;
import com.ets.csm.model.Customer;
import com.ets.csm.model.Email_Template_For_User;
import com.ets.csm.model.SendMails;


public interface EmailTemplateService {
	public List getAllEmailTemplatesInSuperadmin();
	public void saveEmailContent(CupCake_Email_Template cup);
	public List getEmailContentByID(int id);
	public List getEmailContentforUserByUserName(String  username);
	public void saveEmailTemplateForuser(Email_Template_For_User us);
	public List getEmailTemplateUserById(int us);
	public void saveSendMail(SendMails s);
	
	public List getSendMailsByUserName(String  username);

}
