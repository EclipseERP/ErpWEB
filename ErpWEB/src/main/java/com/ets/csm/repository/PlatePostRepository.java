package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.PlatePostDetails;

@Repository("platePostRepository")
public interface PlatePostRepository extends JpaRepository<PlatePostDetails, Integer>{
	
	@Query("SELECT PPD FROM PlatePostDetails PPD")
	public List getAllPlatePostDetails();
	
	@Query("SELECT PPD FROM PlatePostDetails PPD WHERE PPD.id =:id")
	public List getAllPlatePostDetailsByid(@Param ("id") Integer id);
	
	@Query("SELECT PPD FROM PlatePostDetails PPD WHERE PPD.id =:id")
	public PlatePostDetails getallPlatePostDetailsById(@Param ("id") Integer id);
	
	@Query("SELECT PPD,MAT FROM PlatePostDetails PPD LEFT JOIN PPD.materialsUser MAT LEFT JOIN PPD.tierId TD WHERE PPD.tierId.id =:tierId")
	public List getAllPlatePostDetailsByTierId(@Param ("tierId") Integer tierId);
	
	@Query("SELECT PPD.postNo,MAT.description,PPD.id FROM PlatePostDetails PPD LEFT JOIN PPD.materialsUser MAT LEFT JOIN PPD.tierId TD WHERE PPD.tierId.id =:tierId")
	public List getPlateMetriByTier(@Param ("tierId") Integer tierId);

}
