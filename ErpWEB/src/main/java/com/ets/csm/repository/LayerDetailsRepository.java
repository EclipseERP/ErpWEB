package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.LayerDetails;

@Repository("layerDetailsRepository")
public interface LayerDetailsRepository extends JpaRepository<LayerDetails, Integer>{
	
	
	@Query("SELECT LD FROM LayerDetails LD")
	public List getLayerDetails();
	
	@Query("SELECT LD FROM LayerDetails LD WHERE LD.id =:id")
	public LayerDetails getLayerDetailsByid(@Param ("id") Integer id);
	
	@Query("SELECT LD,REC,FEL FROM LayerDetails LD LEFT JOIN LD.recipeUser REC LEFT JOIN LD.fillingsUser FEL LEFT JOIN LD.tierDetails T WHERE T.id =:id")
	public List getlayerDetailsByTier(@Param ("id") Integer id);
	
	@Query("SELECT LD FROM LayerDetails LD JOIN LD.tierDetails T WHERE T.id =:id")
	public List getlayersByTierID(@Param ("id") Integer id);
	
	

}
