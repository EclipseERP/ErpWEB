package com.ets.csm.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.Referral;
import com.ets.csm.model.User;


@Repository
public interface ReferralRepository extends JpaRepository<Referral, Integer>{
	
	@Query("SELECT R FROM Referral R order by R.id desc")
	public List getAllReferral();
	
	@Query("SELECT R FROM Referral R WHERE R.id =:id")
	public List getAllReferralById(@Param ("id") Integer id);
	
	@Query("SELECT R FROM Referral R WHERE R.id =:id")
	public Referral getReferralByRefID(@Param ("id") Integer id);
	
	
	@Query("SELECT R FROM Referral R where R.user.userName=:userName and R.status<>0 order by R.id desc")
	public List getAllReferralByUserName(@Param ("userName") String username);
	
	@Query("SELECT R FROM Referral R where R.user.userName=:userName  order by R.id desc")
	public List getAllReferralByUserName_NoStatusFlag(@Param ("userName") String username);
	
	
	
	@Query("SELECT R FROM Referral R order by R.id desc")
	public List getAllReferrals();
	
	
	
	

}
