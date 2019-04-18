package com.ets.csm.service;

import java.util.List;
import com.ets.csm.model.AppointmentEvent;

public interface AppointmentEventService {

	 public List getAllAppoinEvent();
	 
	 public List getAllAppoinEventBYid(Integer id);
	 
	 public List getAllAppoinEventBYUserid(String userName);

	public void saveAppoinEvent(AppointmentEvent appev);
	
	public void removeAppoinEvent(AppointmentEvent appev);

	public AppointmentEvent saveOrUpdate(AppointmentEvent appev);
	
}
