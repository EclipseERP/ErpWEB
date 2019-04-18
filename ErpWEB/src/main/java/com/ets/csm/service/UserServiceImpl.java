package com.ets.csm.service;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ets.csm.model.CompanyDetails;
import com.ets.csm.model.Country;
import com.ets.csm.model.Localization;
import com.ets.csm.model.Role;
import com.ets.csm.model.SettingsMaster;
import com.ets.csm.model.SocialProfiles;
import com.ets.csm.model.SuperAdminHelpSetting;
import com.ets.csm.model.UnitConversion;
import com.ets.csm.model.User;
import com.ets.csm.repository.CompanyInfoRepository;
import com.ets.csm.repository.CountryRepository;
import com.ets.csm.repository.LocalizationRepository;
import com.ets.csm.repository.RoleRepository;
import com.ets.csm.repository.SettingsRepository;
import com.ets.csm.repository.SocialProfileRepository;
import com.ets.csm.repository.SuperAdminHelpSettings;
import com.ets.csm.repository.UnitConversionRepository;
import com.ets.csm.repository.UserRepository;

@Service("userService")
public class UserServiceImpl  implements UserService  {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    
    @Autowired
    private CompanyInfoRepository companyinforepository;
 
    @Autowired
    CountryRepository countrieRepository;
    
    @Autowired
    SettingsRepository settingrepository;
    
    @Autowired
    UnitConversionRepository covertionrepository;
   
    @Autowired
    SocialProfileRepository socialprofilerepository;
    
//  @Autowired
//  SocialProfileRepository socialprofilerepository;
    
    @Autowired
    SuperAdminHelpSettings superadminhelsettings;
    
    @Autowired
    LocalizationRepository localization;
    
	@Override
	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public void saveUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
	}
	
	 public List getAllUser() {
		
	 return userRepository.getAllUser();
	}
	 
	 public List getUserDataByID(String email) {
		 
		 return userRepository.getUserDataByID(email);
	 }
	 
	 public Optional<User> findById(Long id) {
		 
		 return userRepository.findById(id);
	 }
	 
	 public User saveOrUpdate(User user) {
		 
		 return userRepository.save(user);
	 }
	 
	 
	 public List getAll() {
		 
		 return userRepository.findAll();
	 }

	@Override
	public List getUserName() {
		// TODO Auto-generated method stub
	
		return userRepository.getUserName();
	}

	@Override
	public void remove(User user) {
		userRepository.delete(user);
		
	}
	 
	@Override
	public User getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return userRepository.getUserByUserName(userName);
	}

	@Override
	public List getActiveUser() {
		// TODO Auto-generated method stub
		return userRepository.getActiveUser();
	}

	@Override
	public List getInactiveUser() {
		// TODO Auto-generated method stub
		return userRepository.getInactiveUser();
	}
	 
	@Override
	public List getUserByRole() {
		// TODO Auto-generated method stub
		return userRepository.getUserByRole();
	}

	@Override
	public CompanyDetails getCompanyInfoByUsername(String username) {
		// TODO Auto-generated method stub
		return companyinforepository.getCompanyDetailsByUserName(username);
	}

	@Override
	public void saveCompanyInfoOrUpdate(CompanyDetails companydetals) {
		// TODO Auto-generated method stub
		companyinforepository.save(companydetals);
	}

	@Override
	public List getCountry() {
		// TODO Auto-generated method stub
		return countrieRepository.getCountry();
	}
	
	
	@Override
	public List getCountryByCountryCode(int countrycode) {
		// TODO Auto-generated method stub
		return countrieRepository.getCountryByCountryCode(countrycode);
	}
	
	@Override
	public List getSettingMasterDetails(String username)
	{
		return settingrepository.getSettingMasterDetails(username);
	}

	@Override
	public SettingsMaster saveOrUpdate(SettingsMaster set) {
		// TODO Auto-generated method stub
		return settingrepository.save(set);
	}
	

	public void saveAllSettings(List<SettingsMaster> set)
	{
		settingrepository.saveAll(set);
	}

	@Override
	public SettingsMaster getSettingMsterDetailsbyId(Integer id) {
		// TODO Auto-generated method stub
		return settingrepository.getSettingMasterByID(id);
	}


	@Override
	public List getConversionTooldata(String userName) {
		// TODO Auto-generated method stub
	return covertionrepository.getUnitConverstionData(userName);
	}
	
	@Override
	public UnitConversion saveOrUpdate(UnitConversion set) {
		// TODO Auto-generated method stub
		return covertionrepository.save(set);
	}

	@Override
	public UnitConversion getUnitConversionDataById(Integer id) {
		// TODO Auto-generated method stub
		return covertionrepository.getUnitConversionById(id);
	}
	@Override
	public List getSocialDataByUsername(String username)
	{
    return socialprofilerepository.getSocialProfileDateByUserName(username);
	}
	
	@Override
	public void addSocialProfile(SocialProfiles sobj)
	{
		socialprofilerepository.save(sobj);
	}
	
	@Override
	public void deleteSocialProfile(SocialProfiles sobj)
	{
		socialprofilerepository.delete(sobj);
	}

	@Override
	public List getCurrentUserTheme(String userName) {
		// TODO Auto-generated method stub
		return userRepository.getCurrentUserTheme(userName);
	}
	@Override
     public List getLoginDetailsByEmailAndPassword(String email,String password)
     {
    	 return userRepository.getUserDataByIDAndPassword(email, password);
     }
	@Override
	public List getUserDataByEmail_Validate(String email)
	{
		return userRepository.getUserDataByEmail(email);
	}
	
	@Override
	public List getUserDataByEmailOnlyActive(String email)
	{
		return userRepository.getUserDataByEmailByActive(email);
	}

	@Override
	public User getAllUserDetails(String username)
	{
		return userRepository.getUserByUserName(username);
	}
	
	@Override
	public void updateUserDetails(String username,String email,long id)
	{
		userRepository.updateUser(username, email, id);
	}
	
	@Override
	public List getSuperAdminHelpSettings(String userName)
	{
		return superadminhelsettings.getAllSettingByUserName(userName);
	}
	
	@Override
	public void saveSuperadminHelpSetting(SuperAdminHelpSetting settings)
	{
		superadminhelsettings.save(settings);
	}
	
	@Override
	public void updateHelpSetting(long id,String settingHeader,String settingcontent)
	{
		superadminhelsettings.updateHELPSettings(id, settingHeader, settingcontent);
	}
	
	@Override
	public List getHelpSettingsById(int id)
	{
		return superadminhelsettings.getAllSettingByID(id);
	}
	@Override
	public SuperAdminHelpSetting getSettingDataByName(String settingname)
	{
		return superadminhelsettings.getAllSettingBySettingname(settingname);
	}
	
	@Override
	public List getAllLocalizationBYUserid(String userName)
	{
		return localization.getAllLocalizationBYUserid(userName);
	}
	@Override
	public void saveLocalization(Localization localizations)
	{
		localization.save(localizations);
	}
	
	@Override
	public User getUserByRowId(long id)
	{
		return userRepository.getUserDataByRowId(id);
	}

}
