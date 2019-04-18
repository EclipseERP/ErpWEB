package com.ets.csm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ets.csm.model.CupCakeImage;

@Repository("cupCakeImageRepository")

public interface CupCakeImageRepository extends JpaRepository<CupCakeImage, Integer> {

	@Query("SELECT CK FROM CupCakeImage CK WHERE CK.id =:id")
	public List getAllCupCakeImageBYid(@Param ("id") Integer id);
	
	@Query("SELECT CK FROM CupCakeImage CK WHERE CK.id =:id")
	public CupCakeImage getallCupCakeImageById(@Param ("id") Integer id);
	
	@Query("SELECT CK FROM CupCakeImage CK WHERE CK.cupCake.id =:cupCakeId")
	public List getCupCakeImageCake(@Param ("cupCakeId") Integer cupCakeId);
	
	
	
	
	
	
	
}