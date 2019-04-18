package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ets.csm.model.RecipePricingUser;

public interface RecipePricingUserRepository extends JpaRepository<RecipePricingUser, Integer>{

	@Query("SELECT RPU FROM RecipePricingUser RPU")
	public List getAllRecipePricingUser();
	
	@Query("SELECT RPU FROM RecipePricingUser RPU WHERE RPU.id =:id")
	public List getAllRecipePricingUserByid(@Param ("id") Integer id);
	
	@Query("SELECT RPU,RP,RCP FROM RecipePricingUser RPU JOIN RPU.recipeUser RP JOIN RPU.cupCake RCP WHERE RPU.user.userName =:userName order by RPU.id desc")
	public List getAllRecipePricingUserBYUserid(@Param ("userName") String userName);
	 
	
}
