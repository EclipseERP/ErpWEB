package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.CupCakePricing;

@Repository("cpCakePricing_Repository")
public interface CpCakePricingRepository extends JpaRepository<CupCakePricing, Integer>{
	
	@Query("SELECT C FROM CupCakePricing C")
	public List getAllCupCakesize();
	
	@Query("SELECT C FROM CupCakePricing C WHERE C.id =:id")
	public List getAllCupCakesizeid(@Param ("id") Integer id);
	
	/*@Query("SELECT C FROM CupCakePricing C WHERE C.user.userName =:userName")
	public List getAllItemsBYUserid(@Param ("userName") String userName);*/
	
	@Query("SELECT C FROM CupCakePricing C JOIN C.user U JOIN U.roles R WHERE R.role='ROLE_ADMIN'")
	public List getCupCakesBYAdmin();
	

}
