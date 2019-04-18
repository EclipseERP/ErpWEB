package com.ets.csm.service;

import java.util.List;
import com.ets.csm.model.Events;

public interface EventsService {

	 public List getAllEvents();
	 
	 public List getAllEventsBYid(Integer id);
	 
	 public Events getallEventsById(Integer id);
	 
	 public List getAllEventsBYUserid(String userName);
	 
	 public List getEventsUser(String userName);

	public void saveEvents(Events ev);
	
	public void removeEvents(Events ev);

	public Events saveOrUpdate(Events ev);
	
	public int totalEvents(String userName);
	
	
	
	
}
