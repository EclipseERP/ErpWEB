package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.MaterialsUser;

@Repository("materialsUserRepository")
public interface MaterialsUserRepository extends JpaRepository<MaterialsUser, Integer>{
	
	@Query("SELECT MU FROM MaterialsUser MU")
	public List getAllMaterialsUser();
	
	@Query("SELECT MU FROM MaterialsUser MU WHERE MU.id =:id")
	public List getAllMaterialsUserByid(@Param ("id") Integer id);
	
	@Query("SELECT MU FROM MaterialsUser MU WHERE MU.id =:id")
	public MaterialsUser getallMaterialsUserById(@Param ("id") Integer id);
	
	@Query("SELECT MU,MCU FROM MaterialsUser MU JOIN MU.category MCU WHERE MU.user.userName =:userName order by MU.id desc")
	public List getAllMaterialsUserByUsername(@Param ("userName") String userName);
	
	@Query("SELECT MU FROM MaterialsUser MU WHERE MU.user.userName =:userName")
	public List tierMaterialsUser(@Param ("userName") String userName);

}
