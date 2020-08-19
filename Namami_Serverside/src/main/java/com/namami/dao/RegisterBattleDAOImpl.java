package com.namami.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.namami.entity.RegisterBattleEntity;
import com.namami.model.RegisterBattle;

@Repository(value = "registerBattleDAO")
public class RegisterBattleDAOImpl implements RegisterBattleDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<RegisterBattle> getDetails(String date) throws Exception {
		Query query = entityManager.createQuery("select r from RegisterBattleEntity r where date = :date");
		query.setParameter("date", date);
		
		List<RegisterBattle> registerBattles = new ArrayList<RegisterBattle>();
		List<RegisterBattleEntity> registerBattleEntities = query.getResultList();
		
		if(!registerBattleEntities.isEmpty()) {
			for(RegisterBattleEntity registerEntity:registerBattleEntities) {
				RegisterBattle registerBattle = new RegisterBattle();
				registerBattle.setDate(registerEntity.getDate());
				registerBattle.setEmail(registerEntity.getEmail());
				registerBattle.setImgurl(registerEntity.getImgurl());
				registerBattles.add(registerBattle);
			}
		}
		
		return registerBattles;
	}

}
