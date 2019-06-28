package com.ets.csm.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.transaction.annotation.*;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.*;
import org.springframework.data.jpa.repository.Query;
import com.ets.csm.model.Projects;

@Repository("projectRepository")
public interface ProjectsRepository extends JpaRepository<Projects, Integer>,ProjectRepositoryCustom {
	
	
	@Query("SELECT P from Projects P order by P.id")
	public List getAllProjects();
	
	@Query("SELECT P FROM Projects P WHERE P.id =:id")
	public List getAllProjectsByID(@Param ("id") Integer id);
	
	@Query("SELECT P FROM Projects P WHERE P.project_code =:project_code")
	public List getAllProjectsByProjectCode(@Param ("project_code") String project_code);
	
	@Query("SELECT P FROM Projects P WHERE year(P.date) =:date")
	public List<Projects> getAllProjectsByYear(@Param ("date") String date);
	
	
	
	public Projects findFirstByOrderByIdDesc();
	
	public List<Projects> findByLoanoIgnoreCaseStartingWith(String loa);
	
	public List<Projects> findByStateIgnoreCaseStartingWith(String state);
	
	public List<Projects> findByLoanoIgnoreCaseContainingOrStateIgnoreCaseContainingOrDateContaining(String loa,String state,String date);
	public default List<Projects> findAll(Long id) {
		//Projects project = new Projects();
		Projects projects1 = (Projects) this.getSession().find(Projects.class,id);
		Iterable<Projects> projects = this.findAll();
		List<Projects> projectss = new ArrayList<Projects>();
		projects.forEach(projectss::add);
		Iterator i = projects.iterator();
		while(i.hasNext()) {
			Projects project = (Projects) i.next();
			Hibernate.initialize(project.getTransports());
		}
		return projectss;
		
	}

	@Query("SELECT P from Projects P group by P.loano")
	public List getAllProjectsGroupByLoaNO();
	
	@Transactional
	public default Projects merge(Projects p) {
		return (Projects) this.getSession().merge(p);
	}

	
	
	
	
}
