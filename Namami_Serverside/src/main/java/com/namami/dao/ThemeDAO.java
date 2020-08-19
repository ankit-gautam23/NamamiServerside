package com.namami.dao;

import java.util.List;

import com.namami.model.Theme;

public interface ThemeDAO {
	public List<Theme> getThemeByDate(String tdate) throws Exception;
}
