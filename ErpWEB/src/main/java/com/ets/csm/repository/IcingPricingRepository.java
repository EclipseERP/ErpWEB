package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.IcingPricing;

@Repository("icingPricingRepository")
public interface IcingPricingRepository extends JpaRepository<IcingPricing, Integer>{

	@Query("SELECT IP FROM IcingPricing IP")
	public List getAllIcingPricingUser();
	
	@Query("SELECT IP FROM IcingPricing IP WHERE IP.id =:id")
	public List getAllIcingPricingUserByid(@Param ("id") Integer id);
	
	@Query("SELECT IP,IPU,ICP FROM IcingPricing IP JOIN IP.icingUser IPU JOIN IP.cupCake ICP WHERE IP.user.userName =:userName order by IP.id desc")
	public List getAllIcingPricingUserBYUserid(@Param ("userName") String userName);
	
}
