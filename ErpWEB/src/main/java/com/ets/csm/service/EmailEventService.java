package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.EmailEventType;

public interface EmailEventService{

 public List getAllEmailEvent();
	 
	public List getAllEmailEventBYid(Integer id);
	 
	public EmailEventType getAllEmailEventById(Integer id);

	public void saveCategory(EmailEventType eet);
	
	public void removeCategory(EmailEventType eet);

	public void saveOrUpdateCat(EmailEventType eet);
	
}
