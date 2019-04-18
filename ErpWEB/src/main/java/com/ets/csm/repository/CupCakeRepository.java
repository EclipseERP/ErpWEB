package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.CupCake;

@Repository ("CupCakeRepository")
public interface CupCakeRepository extends JpaRepository<CupCake, Integer>{
	
	@Query("SELECT CPK FROM CupCake CPK")
	public List getAllCupCake();
	
	@Query("SELECT CPK,RCP FROM CupCake CPK LEFT JOIN CPK.recipe RCP WHERE CPK.id =:id")
	public List getAllupCakeByid(@Param ("id") Integer id);
	
	@Query("SELECT CPK FROM CupCake CPK WHERE CPK.id =:id")
	public CupCake getAllCupCakeByid(@Param ("id") Integer id);
	
	@Query("SELECT CPK FROM CupCake CPK WHERE  CPK.id=(SELECT max(CPK.id) FROM CupCake CPK)")
	public CupCake getCupCakeByMaxid();
	
	/*@Query("SELECT CPK FROM CupCake CPK WHERE CPK.user.userName =:userName")
	public List getAllCupCakeBYUserName(@Param ("userName") String userName);*/
	
	@Query("SELECT CPK,RC,CUS,EV,VN,PR,IC,FU,TU,WU FROM CupCake CPK LEFT JOIN CPK.recipe RC LEFT JOIN CPK.customer CUS LEFT JOIN CPK.events EV LEFT JOIN CPK.venue VN LEFT JOIN CPK.cpCkPricingUser PR LEFT JOIN CPK.icingUser IC LEFT JOIN CPK.fillingsUser FU LEFT JOIN CPK.toppingUser TU LEFT JOIN CPK.wrappingUser WU WHERE CPK.user.userName =:userName")
    public List getAllCupCakeBYUserName(@Param ("userName") String userName);
	
	@Query("SELECT CPK FROM CupCake CPK  WHERE CPK.id =:id")
	public List getAllupCakeByidWithoutJoining(@Param ("id") Integer id);
}
