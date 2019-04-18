package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.MaterialsMaster;

@Repository("materialsMasterRepository")
public interface MaterialsMasterRepository extends JpaRepository<MaterialsMaster, Integer>{
	
	@Query("SELECT MM FROM MaterialsMaster MM")
	public List getAllMaterialsMaster();
	
	@Query("SELECT MM FROM MaterialsMaster MM WHERE MM.id =:id")
	public List getAllMaterialsMasterid(@Param ("id") Integer id);
 

}
