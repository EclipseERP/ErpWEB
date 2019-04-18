package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.MaterialCategories;

@Repository("materialCategoryRepository")
public interface MaterialCategoriesRepository extends JpaRepository<MaterialCategories, Integer>{
	
	@Query("SELECT MC FROM MaterialCategories MC")
	public List getAllMaterialCategories();
	
	@Query("SELECT MC FROM MaterialCategories MC WHERE MC.id =:id")
	public List getAllMaterialCategoriesByid(@Param ("id") Integer id);
	
	@Query("SELECT MC FROM MaterialCategories MC WHERE MC.id =:id")
	public MaterialCategories getallMaterialCategoriesById(@Param ("id") Integer id);
	
	@Query("SELECT MC FROM MaterialCategories MC WHERE MC.user.userName =:userName order by MC.id desc")
	public List getAllMaterialCategoriesByUsername(@Param ("userName") String userName);
	 

}
