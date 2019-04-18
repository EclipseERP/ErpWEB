package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ets.csm.model.FillingPurchaseMaster;



@Repository("fillingPurchaseMasterRepository")
public interface FillingPurchaseMasterRepository extends JpaRepository<FillingPurchaseMaster, Integer>{

	
	@Query("SELECT IM FROM FillingPurchaseMaster IM")
	public List getAllFillingPurchaseMaster();
	
	@Query("SELECT IM FROM FillingPurchaseMaster IM WHERE IM.id =:id")
	public List getAllFillingPurchaseMasterByid(@Param ("id") Integer id);
	

	
}
