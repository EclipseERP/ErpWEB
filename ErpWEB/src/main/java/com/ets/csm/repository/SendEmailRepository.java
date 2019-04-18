package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.SendMails;

@Repository
public interface SendEmailRepository extends JpaRepository<SendMails, Integer> {
	
	
	@Query("SELECT AE,CUS FROM SendMails AE LEFT JOIN AE.customer CUS  WHERE AE.user.userName =:userName")
	public List getSendMails_From_UserName(@Param ("userName") String userName);

}
