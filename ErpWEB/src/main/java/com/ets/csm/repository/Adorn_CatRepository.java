package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ets.csm.model.Adorn_Cat;

public interface Adorn_CatRepository extends JpaRepository<Adorn_Cat, Integer>{
	
	@Query("SELECT A FROM Adorn_Cat A")
	public List getAllCatagories();
	
	@Query("SELECT A FROM Adorn_Cat A WHERE A.id =:id")
	public List getAllCategoriesBYid(@Param ("id") Integer id);
	
	@Query("SELECT A FROM Adorn_Cat A WHERE A.id =:id")
	public Adorn_Cat getAdrCatBYid(@Param ("id") Integer id);
	
	@Query("SELECT A FROM Adorn_Cat A WHERE A.user.userName =:userName")
	public List getAllCategoriesBYUserid(@Param ("userName") String userName);
	

}
