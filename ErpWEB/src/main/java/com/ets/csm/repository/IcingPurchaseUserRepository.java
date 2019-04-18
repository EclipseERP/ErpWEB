package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.IcingPurchaseUser;


@Repository("icingPurchaseUserRepository")
public interface IcingPurchaseUserRepository extends JpaRepository<IcingPurchaseUser, Integer>{
	
	@Query("SELECT IPU FROM IcingPurchaseUser IPU")
	public List getAllIcingPurchaseUser();
	
	@Query("SELECT IPU FROM IcingPurchaseUser IPU WHERE IPU.id =:id")
	public List getAllIcingPurchaseUserByid(@Param ("id") Integer id);
		
	@Query("SELECT IPU FROM IcingPurchaseUser IPU WHERE IPU.id =:id")
	public IcingPurchaseUser getIcingPurchaseUserbyId(@Param ("id") Integer id);
	 
	@Query("SELECT IPU,UN FROM IcingPurchaseUser IPU JOIN IPU.unit UN WHERE IPU.user.userName =:userName")
	public List getAllIcingPurchaseUserByUsername(@Param ("userName") String userName);

	

}





