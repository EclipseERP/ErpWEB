package com.ets.csm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ets.csm.model.SettingsMaster;

public interface SettingsRepository extends JpaRepository<SettingsMaster, Integer>{
	
	@Query("Select S from SettingsMaster S where S.user.userName =:userName")
	public List getSettingMasterDetails(@Param ("userName") String userName);
	
	@Query("Select S from SettingsMaster S where S.id =:id")
	public SettingsMaster getSettingMasterByID(@Param ("id") int id);
	
}
