package com.namami.dao;

import com.namami.model.Battle;

public interface BattleDAO {
	public Battle getBattleDetails(Integer bid) throws Exception;
}
