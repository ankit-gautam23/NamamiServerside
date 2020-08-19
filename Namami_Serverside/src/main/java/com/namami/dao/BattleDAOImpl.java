package com.namami.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.namami.entity.BattleEntity;
import com.namami.model.Battle;

@Repository(value = "battleDAO")
public class BattleDAOImpl implements BattleDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public Battle getBattleDetails(Integer bid) throws Exception {
		
		Query query = entityManager.createQuery("select bd from BattleEntity bd where bd.battleid = :battleid");
		query.setParameter("battleid", bid);
		Battle battle = null;
		List<BattleEntity> battleEntities = query.getResultList();
		
		if (!battleEntities.isEmpty()) {
			BattleEntity battleEntity = battleEntities.get(0);
			battle = new Battle();
			battle.setBattleid(battleEntity.getBattleid());
			battle.setEmail1(battleEntity.getEmail1());
			battle.setEmail2(battleEntity.getEmail2());
			battle.setEndtime(battleEntity.getEndtime());
			battle.setStarttime(battleEntity.getStarttime());
		}
		
		return battle;
	}

}
