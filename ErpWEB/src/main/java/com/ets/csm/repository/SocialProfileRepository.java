package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ets.csm.model.SocialProfiles;

@Repository
public interface SocialProfileRepository extends JpaRepository<SocialProfiles, Integer>{
	
	@Query("Select d from SocialProfiles d where d.user.userName=:userName")
	public List getSocialProfileDateByUserName(@Param("userName") String userName);
	
	@Query("Select d from SocialProfiles d where d.id=:id")
	public SocialProfiles getSocialProfileDateId(@Param("id") Integer id);
	
}



