package com.ets.csm.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ets.csm.model.AppointmentEvent;
import com.ets.csm.repository.AppointmentEventRepository;

@Service
public class AppointmentEventServiceImpl implements AppointmentEventService {

	@Autowired
	AppointmentEventRepository appointmentEventRepository;

	@Override
	public List getAllAppoinEvent() {
		return appointmentEventRepository.getAllAppoinEvent();
	}

	@Override
	public List getAllAppoinEventBYid(Integer id) {
		return appointmentEventRepository.getAllAppoinEventBYid(id);
	}

	@Override
	public List getAllAppoinEventBYUserid(String userName) {
		return appointmentEventRepository.getAllAppoinEventBYUserid(userName);
	}

	@Override
	public void saveAppoinEvent(AppointmentEvent appev) {
		appointmentEventRepository.save(appev);
		
	}

	@Override
	public void removeAppoinEvent(AppointmentEvent appev) {
		appointmentEventRepository.delete(appev);
		
	}

	@Override
	public AppointmentEvent saveOrUpdate(AppointmentEvent appev) {
		return appointmentEventRepository.save(appev);
	} 
	
	
	
}
