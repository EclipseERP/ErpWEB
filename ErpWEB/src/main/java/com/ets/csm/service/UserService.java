package com.ets.csm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.ets.csm.model.CompanyDetails;
import com.ets.csm.model.Localization;
import com.ets.csm.model.SettingsMaster;
import com.ets.csm.model.SocialProfiles;
import com.ets.csm.model.SuperAdminHelpSetting;
import com.ets.csm.model.UnitConversion;
import com.ets.csm.model.User;
import com.ets.csm.repository.SuperAdminHelpSettings;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
	public List getAllUser(); 
	public List getUserDataByID(String email);
	public Optional<User> findById(Long id);
	public User saveOrUpdate(User user);
	public List getAll();
	public List getUserName();
	public void remove(User user);
	public User getUserByUserName(String userName);
	public List getCurrentUserTheme(String userName);
	public List  getActiveUser();
	public List getInactiveUser();
	public List getUserByRole();
	//public List getUserbyId(Long id);
	public CompanyDetails getCompanyInfoByUsername(String username);
	public List getCountry();
	public void saveCompanyInfoOrUpdate(CompanyDetails companydetals);
	public List getCountryByCountryCode(int countrycode);
	public List getSettingMasterDetails(String username);
	public SettingsMaster saveOrUpdate(SettingsMaster set);
	public void saveAllSettings(List<SettingsMaster> set);
	public SettingsMaster getSettingMsterDetailsbyId(Integer id);
	public List getConversionTooldata(String userName);
	public UnitConversion saveOrUpdate(UnitConversion set);
	public UnitConversion getUnitConversionDataById(Integer id);
	public List getSocialDataByUsername(String username);
	public void addSocialProfile(SocialProfiles sobj);
	public void deleteSocialProfile(SocialProfiles sobj);
    public List getLoginDetailsByEmailAndPassword(String email,String password);
    public List getUserDataByEmail_Validate(String email);
	public List getUserDataByEmailOnlyActive(String email);
	public User getAllUserDetails(String username);
	public void updateUserDetails(String username,String email,long id);
	public List getSuperAdminHelpSettings(String userName);
	public void saveSuperadminHelpSetting(SuperAdminHelpSetting settings);
	public void updateHelpSetting(long id,String settingHeader,String settingcontent);
	public List getHelpSettingsById(int id);
	public SuperAdminHelpSetting getSettingDataByName(String settingname);
	public void saveLocalization(Localization localization);
	public List getAllLocalizationBYUserid(String userName);
	public User getUserByRowId(long id);


}