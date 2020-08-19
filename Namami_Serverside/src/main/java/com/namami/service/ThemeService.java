package com.namami.service;

import java.util.List;

import com.namami.model.Theme;

public interface ThemeService {
	public List<Theme> getThemeByDate(String tdate) throws Exception;
}
