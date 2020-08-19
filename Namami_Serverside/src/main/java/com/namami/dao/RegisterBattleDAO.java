package com.namami.dao;

import java.util.List;

import com.namami.model.RegisterBattle;

public interface RegisterBattleDAO {
	public List<RegisterBattle> getDetails(String date) throws Exception;
}
