package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ets.csm.model.Customer;
import com.ets.csm.model.Localization;

public interface LocalizationRepository extends JpaRepository<Localization, Integer>{
	@Query("SELECT L FROM Localization L WHERE L.user.userName =:userName")
	public List getAllLocalizationBYUserid(@Param ("userName") String userName);
	
	
}
