package com.ets.csm.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ets.csm.model.BankDetails;
import com.ets.csm.model.RawMaterials;

public interface RawMaterialsRepository extends JpaRepository<RawMaterials, Integer> {
	
	
	@Query("SELECT I FROM RawMaterials I order by I.id")
	public List getAllRawMaterials();

	@Query("SELECT I FROM RawMaterials I where I.itemCode=:itemCode" )
	public RawMaterials getAllRawMaterialsByItemcode(@Param ("itemCode") String itemCode);

	
	
}
