package com.namami.service;

import java.util.List;

import com.namami.model.CustomBattle;

public interface CustomBattleService {

	public List<CustomBattle> getBattleDetails(String theme) throws Exception;
}
