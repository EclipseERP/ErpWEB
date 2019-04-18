package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.IcingPurchaseMaster;

@Repository("icingPurchaseMasterRepository")
public interface IcingPurchaseMasterRepository extends JpaRepository<IcingPurchaseMaster, Integer>{
	
	
	@Query("SELECT IPM FROM IcingPurchaseMaster IPM")
	public List getAllIcingPurchaseMaster();
	
	@Query("SELECT IPM FROM IcingPurchaseMaster IPM WHERE IPM.id =:id")
	public List getAllIcingPurchaseMasterByid(@Param ("id") Integer id);
	

}
