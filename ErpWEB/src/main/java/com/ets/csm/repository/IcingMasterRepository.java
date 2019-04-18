package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.IcingsMaster;


@Repository("icingMasterRepository")
public interface IcingMasterRepository extends JpaRepository<IcingsMaster, Integer>{
	
	@Query("SELECT IM FROM IcingsMaster IM")
	public List getAllIcingsMaster();
	
	@Query("SELECT IM FROM IcingsMaster IM WHERE IM.id =:id")
	public List getAllIcingsMasterByid(@Param ("id") Integer id);
		
	@Query("SELECT IM FROM IcingsMaster IM WHERE IM.id =:id")
	public IcingsMaster getIcingsMasterbyId(@Param ("id") Integer id);
	 
	/*@Query("SELECT RM FROM IcingsMaster RM JOIN RM.ingredientsId IM JOIN IM.unitId UN")
	public List getAllRecipeMasterByIngredient();*/
	
	@Query("SELECT IM FROM IcingsMaster IM WHERE  IM.id=(SELECT max(IM.id) FROM IcingsMaster IM)")
	public List getIcingsMasterByMaxid();
	

}
