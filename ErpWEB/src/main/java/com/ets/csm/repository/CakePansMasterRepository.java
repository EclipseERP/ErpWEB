package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.CakePansMaster;

@Repository("cakePanMasetrRepository")
public interface CakePansMasterRepository extends JpaRepository<CakePansMaster, Integer>{
	
	 
	@Query("SELECT CP FROM CakePansMaster CP")
	public List getAllCakePanMasterSize();
	
	@Query("SELECT CP FROM CakePansMaster CP WHERE CP.id =:id")
	public List getAllCakePanMasterSizeid(@Param ("id") Integer id);
	
	
	

}
