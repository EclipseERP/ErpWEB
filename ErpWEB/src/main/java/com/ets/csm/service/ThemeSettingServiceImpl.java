package com.ets.csm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ets.csm.model.Theme;
import com.ets.csm.repository.ThemeRepository;

@Service
public class ThemeSettingServiceImpl implements ThemeSettingService {
	@Autowired
	ThemeRepository themerepository;
	@Override
	public List getAllTheme() {
		// TODO Auto-generated method stub
		return themerepository.getThemeList();
	}
	@Override
	public Theme getThemeDataByThemeId(int themeid) {
		// TODO Auto-generated method stub
		return themerepository.getThemeDataById(themeid);
	}

}
