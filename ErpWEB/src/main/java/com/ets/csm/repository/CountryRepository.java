package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

	@Query("SELECT C FROM Country C")
	public List getCountry();
	
	@Query("SELECT C FROM Country C where C.id=:id")
	public List getCountryByCountryCode(@Param ("id") int id);
	
	
	
}
