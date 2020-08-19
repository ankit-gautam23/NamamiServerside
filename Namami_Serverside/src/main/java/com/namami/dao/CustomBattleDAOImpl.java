package com.namami.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.namami.entity.CustomBattleEntity;
import com.namami.model.CustomBattle;

@Repository(value = "customBattleDAO")
public class CustomBattleDAOImpl implements CustomBattleDAO {

	@Autowired
	private EntityManager entityManager;
	
	
	@Override
	public List<CustomBattle> getBattleDetails(String theme) throws Exception {
	
		Query query = entityManager.createQuery("select cb from CustomBattleEntity cb where theme = :theme");
		query.setParameter("theme", theme);
		List<CustomBattle> customBattles = new ArrayList<CustomBattle>();
		List<CustomBattleEntity> customBattleEntities = query.getResultList();
		
		if(!customBattleEntities.isEmpty()) {
			for(CustomBattleEntity customBattleEntity: customBattleEntities) {
				CustomBattle customBattle  = new CustomBattle();
				customBattle.setDate(customBattleEntity.getDate());
				customBattle.setEmailid(customBattleEntity.getEmailid());
				customBattle.setTheme(customBattleEntity.getTheme());
				customBattles.add(customBattle);
			}
		}
		
		
		
		return customBattles;
	}

}
