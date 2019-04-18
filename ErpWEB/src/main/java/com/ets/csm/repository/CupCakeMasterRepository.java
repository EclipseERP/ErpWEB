package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.CupCakeMaster;


@Repository("CupCakeMasterRepository")
public interface CupCakeMasterRepository extends JpaRepository<CupCakeMaster, Integer>{
	
	@Query("SELECT CPM FROM CupCakeMaster CPM")
	public List getAllCupCakeMaster();
	
	@Query("SELECT CPM FROM CupCakeMaster CPM WHERE CPM.id =:id")
	public List getAllCupCakeMasterByid(@Param ("id") Integer id);
		
	@Query("SELECT CPM FROM CupCakeMaster CPM WHERE CPM.id =:id")
	public CupCakeMaster getCupCakeMasterbyId(@Param ("id") Integer id);
	
	@Query("SELECT CPM FROM CupCakeMaster CPM WHERE  CPM.id=(SELECT max(CPM.id) FROM CupCakeMaster CPM)")
	public List getCupCakeMasterByMaxid();
	

}
