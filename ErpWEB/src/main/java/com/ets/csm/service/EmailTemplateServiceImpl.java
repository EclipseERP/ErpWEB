package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.CupCake_Email_Template;
import com.ets.csm.model.Email_Template_For_User;
import com.ets.csm.model.SendMails;
import com.ets.csm.repository.EmailTemplateForUser_Repository;
import com.ets.csm.repository.EmailTemplateRepository;
import com.ets.csm.repository.SendEmailRepository;
@Service
public class EmailTemplateServiceImpl implements EmailTemplateService {
	
	@Autowired
	EmailTemplateRepository emailtemplateRepository;
	
	@Autowired
	EmailTemplateForUser_Repository emailtemplateforUserRepository;
	
	@Autowired
	SendEmailRepository sendemailrepository;
	
	@Override
	public List getAllEmailTemplatesInSuperadmin() {
		// TODO Auto-generated method stub
		return emailtemplateRepository.getAllEmailTemplates();
	}

	@Override
	public void saveEmailContent(CupCake_Email_Template cup) {
		// TODO Auto-generated method stub
		emailtemplateRepository.save(cup);
	}
	
	
	@Override
	public List getEmailContentByID(int id) {
		// TODO Auto-generated method stub
		return emailtemplateRepository.getAllEmailTemplatesByID(id);
	}
	
	
	@Override
	public List getEmailContentforUserByUserName(String  username) {
		// TODO Auto-generated method stub
		return emailtemplateforUserRepository.getEmailTemplatesForUser(username);
	}
	
	
	@Override
	public void saveEmailTemplateForuser(Email_Template_For_User us)
	{
		 emailtemplateforUserRepository.save(us);
	}
	
	@Override
	public List getEmailTemplateUserById(int us) {
		// TODO Auto-generated method stub
		return  emailtemplateforUserRepository.getEmailTemplate_User_ByID(us);
	}

	@Override
	public void saveSendMail(SendMails s) {
		// TODO Auto-generated method stub
		sendemailrepository.save(s);
	}

	@Override
	public List getSendMailsByUserName(String username) {
		// TODO Auto-generated method stub
		return sendemailrepository.getSendMails_From_UserName(username);
	}

}
