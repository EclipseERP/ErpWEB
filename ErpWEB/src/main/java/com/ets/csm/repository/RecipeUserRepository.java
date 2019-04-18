package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ets.csm.model.RecipeUser;

@Repository("recpeUserRepository")
public interface RecipeUserRepository extends JpaRepository<RecipeUser, Integer>{

	@Query("SELECT RM FROM RecipeUser RM")
	public List getAllRecipeUser();
	
	@Query("SELECT RM FROM RecipeUser RM WHERE RM.id =:id")
	public List getAllRecipeUserByid(@Param ("id") Integer id);
		
	@Query("SELECT RM FROM RecipeUser RM WHERE RM.id =:id")
	public RecipeUser getRecipeUser(@Param ("id") Integer id);
	
	@Query("SELECT RM FROM RecipeUser RM WHERE  RM.id=(SELECT max(RM.id) FROM RecipeUser RM)")
	public List getRecipeUserByMaxid();
	
	@Query("SELECT RM FROM RecipeUser RM WHERE RM.user.userName =:userName order by RM.id desc")
	public List getAllRecipeUserByUsername(@Param ("userName") String userName);
	 
}
