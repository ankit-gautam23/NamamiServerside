package com.namami.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.namami.entity.ThemeEntity;
import com.namami.model.Theme;


@Repository(value = "themeDAO")
public class ThemeDAOImpl implements ThemeDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Theme> getThemeByDate(String tdate) throws Exception {
		Query query = entityManager.createQuery("select t from ThemeEntity t where tdate = :tdate");
		query.setParameter("tdate", tdate);
		List<Theme> themes = new ArrayList<Theme>();
		List<ThemeEntity> themeEntities = query.getResultList();
		if(!themeEntities.isEmpty()) {
			for(ThemeEntity themeEntity:themeEntities) {
				Theme theme = new Theme();
				theme.setEmail(themeEntity.getEmail());
				theme.setImgurl(themeEntity.getImgurl());
				theme.setTdate(themeEntity.getTdate());
				theme.setTheme(themeEntity.getTheme());
				theme.setThemeid(themeEntity.getThemeid());
				themes.add(theme);
			}
		}
		
		return themes;
	}

}
