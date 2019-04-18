package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ets.csm.model.Calender;
import com.ets.csm.model.Customer;
import com.ets.csm.repository.Calendar_Repository;

@Service
public class Calendar_Service_Impl implements Calendar_Service {

	@Autowired
	Calendar_Repository calenderrepository;
	
	@Override
	public void saveCalendar(Calender cal)
	{
	calenderrepository.save(cal);	
	}

	@Override
	public List getAllAppointmentDataByUserName(String username) {
		// TODO Auto-generated method stub
		return calenderrepository.getAllAppontmentByUserId(username);
	}

	@Override
	public List getAllAppontmentByUserName_CancelledOrRescheduled(String username) {
		// TODO Auto-generated method stub
		return calenderrepository.getAllAppontmentByUserName_CancelledOrRescheduled(username);
	}

	@Override
	public void removeAppointment_Data(Calender cal) {
		calenderrepository.delete(cal);
	}
	
	@Override
	public List getAllAppontmentById(int id) {
		return calenderrepository.getAllAppontmentById(id);
	}
	
	@Override
	public int totalAppointments(String userName) {
		
		return calenderrepository.totalAppointments(userName);
	}

	
	
	
	
	
	
}
