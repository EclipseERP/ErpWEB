package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.IngredientsMaster;


@Repository("ingredientsMasRepository")
public interface IngredientsMasterRepository extends JpaRepository<IngredientsMaster, Integer>{

	
	@Query("SELECT IM FROM IngredientsMaster IM")
	public List getAllIngredientsMaster();
	
	@Query("SELECT IM FROM IngredientsMaster IM WHERE IM.id =:id")
	public List getAllIngredientsMasterByid(@Param ("id") Integer id);
	
	 @Query("SELECT IM FROM IngredientsMaster IM WHERE IM.id =:id")
	   public IngredientsMaster getUserByIngrd(@Param ("id") Integer id);
	
}
