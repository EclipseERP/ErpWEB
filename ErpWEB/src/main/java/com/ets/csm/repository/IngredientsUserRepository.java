package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.IngredientsUser;


@Repository("ingredientsUserRepository")
public interface IngredientsUserRepository extends JpaRepository<IngredientsUser, Integer>{
	
	@Query("SELECT IU FROM IngredientsUser IU")
	public List getAllIngredientsUser();
	
	@Query("SELECT IU FROM IngredientsUser IU WHERE IU.id =:id")
	public List getAllIngredientsUserByid(@Param ("id") Integer id);
		
	@Query("SELECT IU FROM IngredientsUser IU WHERE IU.id =:id")
	public IngredientsUser getIngredientsUserbyId(@Param ("id") Integer id);
	 
	@Query("SELECT IU,UN FROM IngredientsUser IU JOIN IU.unit UN WHERE IU.user.userName =:userName order by IU.id desc")
	public List getAllIngredientsUserByUsername(@Param ("userName") String userName);

	@Query("SELECT IU FROM IngredientsUser IU WHERE  IU.id=(SELECT max(IU.id) FROM IngredientsUser IU)")
	public List getIngredientsUserByMaxid();
	
	

}
