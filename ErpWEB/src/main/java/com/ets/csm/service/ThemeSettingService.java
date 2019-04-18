package com.ets.csm.service;

import java.util.List;

import com.ets.csm.model.Theme;

public interface ThemeSettingService {
	
	public List getAllTheme();
	public Theme getThemeDataByThemeId(int themeid);
}
