package com.ets.csm.repository;

import java.util.List;
import org.springframework.transaction.annotation.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.*;
import org.springframework.data.jpa.repository.Query;
import com.ets.csm.model.Projects;

@Repository("projectRepository")
public interface ProjectsRepository extends JpaRepository<Projects, Integer> {
	
	@Query("SELECT P from Projects P order by P.id")
	public List getAllProjects();
	
	@Query("SELECT P FROM Projects P WHERE P.id =:id")
	public List getAllProjectsByID(@Param ("id") Integer id);
	
	/*
	@Transactional
	@Modifying
	@Query(value="INSERT INTO Projects(id,project_code,loa_no,creation_date,update_date,company_id,user_id) values(:id,:project_code,:loa_no,:creation_date,:update_date,:company_id,:user_id)")
	public Projects saveProject(@Param("id") int id); */
	

}
