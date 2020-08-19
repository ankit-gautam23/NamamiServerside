package com.namami.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namami.dao.BattleDAO;
import com.namami.model.Battle;

@Service(value = "battleService")
@Transactional
public class BattleServiceImpl implements BattleService {

	@Autowired
	private BattleDAO battleDAO;
	
	@Override
	public Battle getBattleDetail(Integer bid) throws Exception {
		Battle battle = battleDAO.getBattleDetails(bid);
		return battle;
	}

}
