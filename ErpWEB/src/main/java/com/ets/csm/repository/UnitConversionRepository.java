package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ets.csm.model.UnitConversion;

public interface UnitConversionRepository extends JpaRepository<UnitConversion, Integer> {
	
	@Query("SELECT U FROM UnitConversion U WHERE U.user.userName =:userName")
	public List getUnitConverstionData(@Param("userName") String userName); 
	
	@Query("SELECT U FROM UnitConversion U WHERE U.id =:id")
	public UnitConversion getUnitConversionById(@Param("id") Integer id);

}
