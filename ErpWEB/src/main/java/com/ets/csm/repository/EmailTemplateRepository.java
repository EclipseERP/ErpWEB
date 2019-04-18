package com.ets.csm.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ets.csm.model.CupCake_Email_Template;

/**
 * @author Pradipto Roy
 *
 */

@Repository("emailTemplateRepository")
public interface EmailTemplateRepository extends JpaRepository<CupCake_Email_Template, Integer> {
	
	   @Query("SELECT T FROM CupCake_Email_Template T")
		public List getAllEmailTemplates();

	   @Query("SELECT T FROM CupCake_Email_Template T where T.sid=:sid")
	   public List getAllEmailTemplatesByID(@Param ("sid") int sid);
   
}
