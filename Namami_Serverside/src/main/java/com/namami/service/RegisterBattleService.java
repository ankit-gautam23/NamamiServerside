package com.namami.service;

import java.util.List;

import com.namami.model.RegisterBattle;

public interface RegisterBattleService {
	public List<RegisterBattle> getDetails(String date)throws Exception;
}
