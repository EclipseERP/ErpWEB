package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.Calender;

public interface Calendar_Service {
	
	public void saveCalendar(Calender cal);
	List getAllAppointmentDataByUserName(String username);
	List getAllAppontmentByUserName_CancelledOrRescheduled(String username);
	public void removeAppointment_Data(Calender cal) ;
	public List getAllAppontmentById(int id);
	public int totalAppointments(String userName);
}
