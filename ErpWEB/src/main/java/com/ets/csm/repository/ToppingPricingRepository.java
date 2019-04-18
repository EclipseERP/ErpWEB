package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.ToppingPricing;

@Repository("ToppingPricingRepository")
public interface ToppingPricingRepository extends JpaRepository<ToppingPricing, Integer>{

	@Query("SELECT TP FROM ToppingPricing TP")
	public List getAllToppingPrice();
	
	@Query("SELECT TP FROM ToppingPricing TP WHERE TP.id =:id")
	public List getAllToppingPriceByid(@Param ("id") Integer id);
	
	@Query("SELECT TP FROM ToppingPricing TP JOIN TP.user U JOIN U.roles R WHERE R.role='ROLE_ADMIN'")
	public List getToppingPriceByAdmin();
	 
	
}
