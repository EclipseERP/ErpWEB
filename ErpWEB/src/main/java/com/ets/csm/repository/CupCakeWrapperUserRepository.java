package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.CupCakeWrapperPriceUser;


@Repository("cupCakeWrapperUserRepository")
public interface CupCakeWrapperUserRepository extends JpaRepository<CupCakeWrapperPriceUser, Integer>{
	
	@Query("SELECT CWP FROM CupCakeWrapperPriceUser CWP")
	public List getAllCupCakeWrapperPriceUser();
	
	@Query("SELECT CWP FROM CupCakeWrapperPriceUser CWP WHERE CWP.id =:id")
	public List getAllCupCakeWrapperPriceUserByid(@Param ("id") Integer id);
	
	@Query("SELECT CWP FROM CupCakeWrapperPriceUser CWP WHERE CWP.id =:id")
	public CupCakeWrapperPriceUser getallCupCakeWrapperPriceUserById(@Param ("id") Integer id);
	
	@Query("SELECT CWP,CWU,CWC FROM CupCakeWrapperPriceUser CWP JOIN CWP.wrapperUser CWU JOIN CWP.cupCake CWC WHERE CWP.user.userName =:userName order by CWP.id desc")
	public List getAllCupCakeWrapperPriceUserByUsername(@Param ("userName") String userName);
	
	
	

}
