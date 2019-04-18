package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ets.csm.model.Venue;


@Repository("venueRepository")
public interface VenueRepository extends JpaRepository<Venue, Integer>{

	@Query("SELECT V FROM Venue V")
	public List getAllVenue();
	
	@Query("SELECT V FROM Venue V WHERE V.id =:id")
	public List getAllVenueBYid(@Param ("id") Integer id);
	
	@Query("SELECT V FROM Venue V WHERE V.id =:id")
	public Venue getallVenueById(@Param ("id") Integer id);
	
	@Query("SELECT V FROM Venue V WHERE V.user.userName =:userName order by V.id desc")
	public List getAllVenueBYUserid(@Param ("userName") String userName);
	
}
