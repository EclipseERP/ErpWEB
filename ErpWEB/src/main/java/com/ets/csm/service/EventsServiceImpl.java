package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ets.csm.model.Events;
import com.ets.csm.repository.EventsRepository;

@Service
public class EventsServiceImpl implements EventsService{

	@Autowired
	private EventsRepository EventsRepository;
	
	@Override
    public List getAllEvents() {
		return EventsRepository.getAllEvents();
	}
	
	@Override
	public List getAllEventsBYid(Integer id) {
		return EventsRepository.getAllEventsBYid(id);
	}
	
	public List getAllEventsBYUserid(String userName) {
		return EventsRepository.getAllEventsBYUserid(userName);
	}

	@Override
	public void saveEvents(Events ev) {
		EventsRepository.save(ev);
	}

	@Override
	public void removeEvents(Events ev) {
		EventsRepository.delete(ev);
	}

	@Override
	public Events saveOrUpdate(Events ev) {
		return EventsRepository.save(ev);
	}

	@Override
	public Events getallEventsById(Integer id) {
		
		return EventsRepository.getallEventsById(id);
	}

	@Override
	public List getEventsUser(String userName) {
		
		return EventsRepository.getEventsUser(userName);
	}
	
	@Override
	public int totalEvents(String userName) {
		
		return EventsRepository.totalEvents(userName);
	}

	
	
	
	
}
