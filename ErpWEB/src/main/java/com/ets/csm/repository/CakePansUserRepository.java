package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.CakePansUser;

@Repository("cakePanUserRepository")
public interface CakePansUserRepository extends JpaRepository<CakePansUser, Integer>{
	
	 
	@Query("SELECT CP FROM CakePansUser CP")
	public List getAllCakePanUserSize();
	
	@Query("SELECT CP FROM CakePansUser CP WHERE CP.id =:id")
	public List getAllCakePanUserSizeid(@Param ("id") Integer id);
	
	@Query("SELECT CP FROM CakePansUser CP WHERE CP.id =:id")
	public CakePansUser getallCakePanUserSizeById(@Param ("id") Integer id);
	
	@Query("SELECT CP,CT FROM CakePansUser CP LEFT JOIN CP.categories CT WHERE CP.user.userName =:userName order by CP.id desc")
	public List getCkPansBYUserid(@Param ("userName") String userName);
	
	@Query("SELECT CP FROM CakePansUser CP JOIN CP.categories CT WHERE CP.categories.id =:categoryId AND CP.user.userName =:userName")
	public List getCkPansBYCategoryId(@Param ("categoryId") Integer categoryId, @Param ("userName") String userName);
	

}
