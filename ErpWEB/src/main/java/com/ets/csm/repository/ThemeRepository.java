package com.ets.csm.repository;

import java.util.List;

import org.hibernate.annotations.ParamDef;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ets.csm.model.Theme;

public interface ThemeRepository extends JpaRepository<Theme, Integer> 
{
	@Query("SELECT T FROM Theme T ")
	public List getThemeList();	
	
	@Query("SELECT T FROM Theme T WHERE T.id=:id")
	public Theme getThemeDataById(@Param ("id") int id);

}
