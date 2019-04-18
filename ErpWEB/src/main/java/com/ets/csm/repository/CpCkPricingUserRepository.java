package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ets.csm.model.CpCakePricingUser;

public interface CpCkPricingUserRepository extends JpaRepository<CpCakePricingUser, Integer>{
	
	@Query("SELECT CU FROM CpCakePricingUser CU")
	public List getAllCupCakePriceUser();
	
	@Query("SELECT CU FROM CpCakePricingUser CU WHERE CU.id =:id")
	public List getAllCupCakePriceUserByid(@Param ("id") Integer id);
	
	@Query("SELECT CU FROM CpCakePricingUser CU WHERE CU.id =:id")
	public CpCakePricingUser getAllCpCakePriceUserByid(@Param ("id") Integer id);
	
	@Query("SELECT CU FROM CpCakePricingUser CU WHERE CU.user.userName =:userName order by CU.id desc")
	public List getAllCupCakePriceBYUserid(@Param ("userName") String userName);
	
	
	

}
