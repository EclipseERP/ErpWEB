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
	
	@Query("SELECT P FROM Projects P WHERE P.project_code =:project_code")
	public List getAllProjectsByProjectCode(@Param ("project_code") String project_code);
	
	@Query("SELECT P FROM Projects P WHERE to_char(P.date,'yyyy')=:date")
	public List<Projects> getAllProjectsByYear(@Param ("date") String date);
	
	
	public List<Projects> findByStateIgnoreCaseStartingWith(String state);
	/*
	@Transactional
	@Modifying
	@Query(value="INSERT INTO Projects(id,project_code,loa_no,creation_date,update_date,company_id,user_id) values(:id,:project_code,:loa_no,:creation_date,:update_date,:company_id,:user_id)")
	public Projects saveProject(@Param("id") int id); */
	
	@Query("SELECT P from Projects P group by P.loa_no")
	public List getAllProjectsGroupByLoaNO();
	
	
	
	
	
}
