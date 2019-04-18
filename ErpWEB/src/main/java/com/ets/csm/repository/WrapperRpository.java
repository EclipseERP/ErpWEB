package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ets.csm.model.WrapperList;

@Repository("wrapperRepository")
public interface WrapperRpository extends JpaRepository<WrapperList, Integer> {
	
	@Query("SELECT W FROM WrapperList W")
	public List getAllWrappers();
	
	@Query("SELECT W FROM WrapperList W WHERE W.id =:id")
	public List getAllWrappersById(@Param ("id") Integer id);
	
	/*@Query("SELECT W FROM WrapperList W WHERE W.user.userName =:userName")
	public List getAllItemsBYUserid(@Param ("userName") String userName);*/
	

}
