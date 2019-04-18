package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.CakePanCategories;

@Repository("cakePanCatRepository")
public interface CakePanCatRepository extends JpaRepository<CakePanCategories, Integer>{
	
	@Query("SELECT CC FROM CakePanCategories CC")
	public List getAllCakePanCategories();
	
	@Query("SELECT CC FROM CakePanCategories CC WHERE CC.id =:id")
	public List getAllCakePanCategoriesBYid(@Param ("id") Integer id);
	
	@Query("SELECT CC FROM CakePanCategories CC WHERE CC.id =:id")
	public CakePanCategories getallCakePanCategoriesById(@Param ("id") Integer id);
	
	@Query("SELECT CC FROM CakePanCategories CC WHERE CC.user.userName =:userName order by CC.id desc")
	public List getAllCakePanCategoriesBYUserid(@Param ("userName") String userName);
	
}
