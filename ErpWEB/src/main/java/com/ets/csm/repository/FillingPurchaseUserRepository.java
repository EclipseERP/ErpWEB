package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.ets.csm.model.FillingPurchaseUser;

@Repository("fillingPurchaseUserRepository")
public interface FillingPurchaseUserRepository extends JpaRepository<FillingPurchaseUser, Integer>{
	
	@Query("SELECT FPU FROM FillingPurchaseUser FPU")
	public List getAllFillingPurchaseUser();
	
	@Query("SELECT FPU FROM FillingPurchaseUser FPU WHERE FPU.id =:id")
	public List getAllFillingPurchaseUserByid(@Param ("id") Integer id);
		
	@Query("SELECT FPU FROM FillingPurchaseUser FPU WHERE FPU.id =:id")
	public FillingPurchaseUser getFillingPurchaseUserbyId(@Param ("id") Integer id);
	 
	@Query("SELECT FPU,UN FROM FillingPurchaseUser FPU JOIN FPU.unit UN WHERE FPU.user.userName =:userName order by FPU.id desc")
	public List getAllFillingPurchaseUserByFillingId(@Param ("userName") String userName);

}
