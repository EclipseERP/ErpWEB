package com.ets.csm.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ets.csm.model.ProjectEIWorkMaster;



public interface ProjectEIWorkRepository extends JpaRepository<ProjectEIWorkMaster, Integer>{

	@Query("SELECT PI FROM ProjectEIWorkMaster PI WHERE PI.project_code =:project_code and PI.itemcode=:itemcode")
	public List getProjectEIWorkByProjectCode(@Param ("project_code") String project_code,@Param ("itemcode") String itemcode);
	
	
}
