package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.Email_Template_For_User;

@Repository
public interface EmailTemplateForUser_Repository extends JpaRepository<Email_Template_For_User, Integer> {
	

	@Query("SELECT AE FROM Email_Template_For_User AE WHERE AE.user.userName =:userName")
	public List getEmailTemplatesForUser(@Param ("userName") String userName);
	
	
	@Query("SELECT E FROM Email_Template_For_User E WHERE E.id =:id")
	public List getEmailTemplate_User_ByID(@Param ("id") Integer id);
	
	
	
}
