package com.namami.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namami.dao.ThemeDAO;
import com.namami.model.Theme;

@Service(value = "themeService")
@Transactional
public class ThemeServiceImpl implements ThemeService {

	@Autowired
	private ThemeDAO themeDAO;
	
	@Override
	public List<Theme> getThemeByDate(String tdate) throws Exception {
		List<Theme> theme = themeDAO.getThemeByDate(tdate);
		return theme;
	}
	
}
