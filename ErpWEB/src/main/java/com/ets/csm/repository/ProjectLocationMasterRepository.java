package com.ets.csm.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ets.csm.model.ProjectLocationMaster;


public interface ProjectLocationMasterRepository extends JpaRepository<ProjectLocationMaster, Integer> {
	
	@Query("SELECT ploc FROM ProjectLocationMaster ploc WHERE ploc.projectLocation =:projectLocation and ploc.projectcode=:projectcode")
	public List getAllProjectLocation(@Param ("projectLocation") String projectLocation,@Param ("projectcode") String projectcode);

}
