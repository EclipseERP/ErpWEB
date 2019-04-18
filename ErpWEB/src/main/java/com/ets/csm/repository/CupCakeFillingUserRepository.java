package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.CupCakeFillingPrice;

@Repository("cpCkFillingRepository")
public interface CupCakeFillingUserRepository extends JpaRepository<CupCakeFillingPrice, Integer>{
	
	@Query("SELECT CFP FROM CupCakeFillingPrice CFP")
	public List getAllCupCakeFillingPrice();
	
	@Query("SELECT CFP FROM CupCakeFillingPrice CFP WHERE CFP.id =:id")
	public List getAllCupCakeFillingPriceByid(@Param ("id") Integer id);
	
	@Query("SELECT CFP FROM CupCakeFillingPrice CFP WHERE CFP.id =:id")
	public CupCakeFillingPrice getallCupCakeFillingPriceById(@Param ("id") Integer id);
	
	@Query("SELECT CFP,CFU,CFC FROM CupCakeFillingPrice CFP JOIN CFP.filling CFU JOIN CFP.cupCake CFC WHERE CFP.user.userName =:userName order by CFP.id desc")
	public List getAllCupCakeFillingPriceByUsername(@Param ("userName") String userName);
	
}
