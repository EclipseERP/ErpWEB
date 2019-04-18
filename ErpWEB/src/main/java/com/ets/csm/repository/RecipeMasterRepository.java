package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.RecipeMaster;

@Repository("recipeMasRepository")
public interface RecipeMasterRepository extends JpaRepository<RecipeMaster, Integer>{
	
	@Query("SELECT RM FROM RecipeMaster RM")
	public List getAllRecipeMaster();
	
	@Query("SELECT RM FROM RecipeMaster RM WHERE RM.id =:id")
	public List getAllRecipeMasterByid(@Param ("id") Integer id);
		
	@Query("SELECT RM FROM RecipeMaster RM WHERE RM.id =:id")
	public RecipeMaster getRecipe(@Param ("id") Integer id);
	 
	/*@Query("SELECT RM FROM RecipeMaster RM JOIN RM.ingredientsId IM JOIN IM.unitId UN")
	public List getAllRecipeMasterByIngredient();*/
	
	@Query("SELECT RM FROM RecipeMaster RM WHERE  RM.id=(SELECT max(RM.id) FROM RecipeMaster RM)")
	public List getRecipeByMaxid();
	

}
