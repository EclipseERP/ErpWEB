package com.ets.csm.repository;

import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ets.csm.model.Adorn_Cat;
import com.ets.csm.model.Role;
import com.ets.csm.model.SuperAdminHelpSetting;

public interface SuperAdminHelpSettings extends JpaRepository<SuperAdminHelpSetting, Integer>{
	
	   @Query("SELECT S FROM SuperAdminHelpSetting S WHERE S.user.userName=:userName")
	   public List getAllSettingByUserName(@Param ("userName") String userName);
	
	   @Transactional
	   @Modifying
	   @Query("UPDATE SuperAdminHelpSetting S SET S.settingheader =:settingheader , S.settingcontent=:settingcontent WHERE S.id=:id")
	   public void updateHELPSettings( @Param ("id") long id, @Param ("settingheader") String settingheader,@Param ("settingcontent") String settingcontent);
	   
	   @Query("SELECT S FROM SuperAdminHelpSetting S WHERE S.id=:id")
	   public List getAllSettingByID(@Param ("id") int id);
	   
	   @Query("SELECT S FROM SuperAdminHelpSetting S WHERE S.settingname=:settingname")
	   public SuperAdminHelpSetting  getAllSettingBySettingname(@Param ("settingname") String settingname);
}
