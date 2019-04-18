package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.EmailEventType;
import com.ets.csm.repository.EmailEventRepository;

@Service
public class EmailEventServiceImpl implements EmailEventService{
	
	@Autowired
	EmailEventRepository emailEventRepository;

	@Override
	public List getAllEmailEvent() {
		// TODO Auto-generated method stub
		return emailEventRepository.getAllEmailEvents();
	}

	@Override
	public List getAllEmailEventBYid(Integer id) {
		// TODO Auto-generated method stub
		return emailEventRepository.getAllEmailEventsBYid(id);
	}

	@Override
	public EmailEventType getAllEmailEventById(Integer id) {
		// TODO Auto-generated method stub
		return emailEventRepository.getAllEmailEventsById(id);
	}

	@Override
	public void saveCategory(EmailEventType eet) {
		emailEventRepository.save(eet);
		
	}

	@Override
	public void removeCategory(EmailEventType eet) {
		emailEventRepository.delete(eet);
		
	}

	@Override
	public void saveOrUpdateCat(EmailEventType eet) {
		emailEventRepository.save(eet);
		
	}

}
