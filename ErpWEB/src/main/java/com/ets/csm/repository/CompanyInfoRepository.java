package com.ets.csm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.CompanyDetails;

@Repository
public interface CompanyInfoRepository extends JpaRepository<CompanyDetails, Integer>
{
	
@Query("SELECT CC,US FROM CompanyDetails CC JOIN CC.user US where CC.user.userName=:userName")	
public CompanyDetails getCompanyDetailsByUserName(@Param("userName") String userName);
	

}
