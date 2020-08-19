package com.namami.dao;

import java.util.List;

import com.namami.model.CustomBattle;

public interface CustomBattleDAO {
	public List<CustomBattle> getBattleDetails(String theme) throws Exception;
}
