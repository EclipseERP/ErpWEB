package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.ProjectStockRecordMaster;
import com.ets.csm.model.Unit;

@Repository("projectstockmasterrepository")
public interface projectStockMasterRepository extends JpaRepository<ProjectStockRecordMaster, Integer>
{
	@Query("SELECT P FROM ProjectStockRecordMaster P WHERE P.projectcode =:projectcode")
	public List getAllProjectsStockByProjectcode(@Param ("projectcode") String projectcode);
	
}
