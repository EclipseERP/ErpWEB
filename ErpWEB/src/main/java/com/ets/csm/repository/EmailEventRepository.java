package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.EmailEventType;

@Repository("emailEventRepository")
public interface EmailEventRepository extends JpaRepository<EmailEventType, Integer>{
	
	@Query("SELECT A FROM EmailEventType A")
	public List getAllEmailEvents();
	
	@Query("SELECT A FROM EmailEventType A WHERE A.id =:id")
	public List getAllEmailEventsBYid(@Param ("id") Integer id);
	
	@Query("SELECT A FROM EmailEventType A WHERE A.id =:id")
	public EmailEventType getAllEmailEventsById(@Param ("id") Integer id);
	
	
	

}
