package com.ets.csm.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ets.csm.model.Events;

@Repository("eventsRepository")
public interface EventsRepository extends JpaRepository<Events, Integer>{

	@Query("SELECT E FROM Events E")
	public List getAllEvents();
	
	@Query("SELECT E FROM Events E WHERE E.id =:id")
	public List getAllEventsBYid(@Param ("id") Integer id);
	
	@Query("SELECT E FROM Events E WHERE E.id =:id")
	public Events getallEventsById(@Param ("id") Integer id);
	
	@Query("SELECT E, C FROM Events E JOIN E.customer C WHERE E.user.userName =:userName")
	public List getAllEventsBYUserid(@Param ("userName") String userName);
	
	@Query("SELECT E FROM Events E WHERE E.user.userName =:userName")
	public List getEventsUser(@Param ("userName") String userName);
	
	@Query("SELECT COUNT(*) FROM Events E WHERE E.user.userName =:userName")
	public int totalEvents(@Param ("userName") String userName);

	
	
	
	
	
	
}
