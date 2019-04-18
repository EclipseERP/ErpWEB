package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.FillingsPricing;

@Repository("FillingRepository")
public interface FillingRepository extends JpaRepository<FillingsPricing, Integer>{
	
	@Query("SELECT FP FROM FillingsPricing FP")
	public List getAllFillingPrice();
	
	@Query("SELECT FP FROM FillingsPricing FP WHERE FP.id =:id")
	public List getAllFillingPriceByid(@Param ("id") Integer id);
	
	@Query("SELECT FP FROM FillingsPricing FP JOIN FP.user U JOIN U.roles R WHERE R.role='ROLE_ADMIN'")
	public List getFillingByAdmin();
	

}
