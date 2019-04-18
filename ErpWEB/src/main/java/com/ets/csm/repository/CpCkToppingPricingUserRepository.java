package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.ets.csm.model.CupCakeToppingPricingUser;

@Repository("cpCkToppingRepository")
public interface CpCkToppingPricingUserRepository extends JpaRepository<CupCakeToppingPricingUser, Integer>{
	
	@Query("SELECT CTP FROM CupCakeToppingPricingUser CTP")
	public List getAllCpCkToppingPricingUser();
	
	@Query("SELECT CTP FROM CupCakeToppingPricingUser CTP WHERE CTP.id =:id")
	public List getAllCpCkToppingPricingUserByid(@Param ("id") Integer id);
	
	@Query("SELECT CTP FROM CupCakeToppingPricingUser CTP WHERE CTP.id =:id")
	public CupCakeToppingPricingUser getallCpCkToppingPricingUserById(@Param ("id") Integer id);
	
	@Query("SELECT CTP,CTU,CTC FROM CupCakeToppingPricingUser CTP JOIN CTP.toppingUser CTU JOIN CTP.cupCake CTC WHERE CTP.user.userName =:userName order by CTP.id desc")
	public List getAllCpCkToppingPricingUserByUsername(@Param ("userName") String userName);

	
}
