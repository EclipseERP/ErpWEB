package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.TierShape;

@Repository("tierShapeRepository")
public interface TierShapeRepository extends JpaRepository<TierShape, Integer>{

	@Query("SELECT TS FROM TierShape TS")
	public List getAllTierShape();
	
	@Query("SELECT TS FROM TierShape TS WHERE TS.id =:id")
	public List getAllTierShapeByid(@Param ("id") Integer id);
	
	@Query("SELECT TS FROM TierShape TS WHERE TS.id =:id")
	public TierShape getallTierShapeById(@Param ("id") Integer id);
	
	@Query("SELECT TS FROM TierShape TS WHERE TS.user.userName =:userName")
	public List getAllTierShapeByUsername(@Param ("userName") String userName);
	
}
