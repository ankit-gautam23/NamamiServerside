package com.namami.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namami.dao.CustomBattleDAO;
import com.namami.model.CustomBattle;

@Service(value = "customBattleService")
@Transactional
public class CustomBattleServiceImpl implements CustomBattleService {

	@Autowired
	private CustomBattleDAO customBattleDAO;
	
	@Override
	public List<CustomBattle> getBattleDetails(String theme) throws Exception {
		List<CustomBattle> cbattle = customBattleDAO.getBattleDetails(theme);
		return cbattle;
	}

}
