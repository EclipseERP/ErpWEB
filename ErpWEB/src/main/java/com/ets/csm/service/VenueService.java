package com.ets.csm.service;

import java.util.List;
import com.ets.csm.model.Venue;

public interface VenueService {

	 public List getAllVenue();
	 
	 public List getAllVenueBYid(Integer id);
	 
	 public Venue getallVenueById(Integer id);
	 
	 public List getAllVenueBYUserid(String userName);

	public void saveVenue(Venue ven);
	
	public void removeVenue(Venue ven);

	public Venue saveOrUpdate(Venue ven);
}
