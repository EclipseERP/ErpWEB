package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.WrapperPricing;

@Repository("WrappingRepository")
public interface WrapperPricingRepository extends JpaRepository<WrapperPricing, Integer>{
	
	@Query("SELECT WP FROM WrapperPricing WP")
	public List getAllWrapperPrice();
	
	@Query("SELECT WP FROM WrapperPricing WP WHERE WP.id =:id")
	public List getAllWrapperPriceByid(@Param ("id") Integer id);
	
	@Query("SELECT WP FROM WrapperPricing WP JOIN WP.user U JOIN U.roles R WHERE R.role='ROLE_ADMIN'")
	public List getWrapperPriceByAdmin();
	

}
