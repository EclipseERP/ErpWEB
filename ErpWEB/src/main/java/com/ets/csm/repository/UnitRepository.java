package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.Unit;

@Repository("unitRepository")
public interface UnitRepository extends JpaRepository<Unit, Integer>{
	
	@Query("SELECT UN FROM Unit UN")
	public List getAllUnit();
	
	@Query("SELECT UN FROM Unit UN WHERE UN.id =:id")
	public List getAllUnitByid(@Param ("id") Integer id);
	
	@Query("SELECT UN FROM Unit UN WHERE UN.id =:id")
	public Unit getUnit(@Param ("id") Integer id);
	

}
