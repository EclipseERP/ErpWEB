package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.RecipePricing;

@Repository("RecipePricingRepository")
public interface RecipePricingRepository extends JpaRepository<RecipePricing, Integer>{

	
	@Query("SELECT RP FROM RecipePricing RP")
	public List getAllRecipePrice();
	
	@Query("SELECT RP FROM RecipePricing RP WHERE RP.id =:id")
	public List getAllRecipePriceByid(@Param ("id") Integer id);
	
	@Query("SELECT RP FROM RecipePricing RP JOIN RP.user U JOIN U.roles R WHERE R.role='ROLE_ADMIN'")
	public List getRecipePriceByAdmin();
}
