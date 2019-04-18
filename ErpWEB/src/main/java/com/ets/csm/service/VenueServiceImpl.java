package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ets.csm.model.Venue;
import com.ets.csm.repository.VenueRepository;

@Service
public class VenueServiceImpl implements VenueService{

	@Autowired
	private VenueRepository VenueRepository;
	
	@Override
    public List getAllVenue() {
		return VenueRepository.getAllVenue();
	}
	
	@Override
	public List getAllVenueBYid(Integer id) {
		return VenueRepository.getAllVenueBYid(id);
	}
	
	public List getAllVenueBYUserid(String userName) {
		return VenueRepository.getAllVenueBYUserid(userName);
	}

	@Override
	public void saveVenue(Venue ven) {
		VenueRepository.save(ven);
	}

	@Override
	public void removeVenue(Venue ven) {
		VenueRepository.delete(ven);
	}

	@Override
	public Venue saveOrUpdate(Venue ven) {
		return VenueRepository.save(ven);
	}

	@Override
	public Venue getallVenueById(Integer id) {
		
		return VenueRepository.getallVenueById(id);
	}
}
