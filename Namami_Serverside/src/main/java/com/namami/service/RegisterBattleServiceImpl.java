package com.namami.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namami.dao.RegisterBattleDAO;
import com.namami.model.RegisterBattle;

@Service(value = "registerBattleService")
@Transactional
public class RegisterBattleServiceImpl implements RegisterBattleService {

	@Autowired
	private RegisterBattleDAO registerBattleDAO;
	
	@Override
	public List<RegisterBattle> getDetails(String date) throws Exception {
		List<RegisterBattle> registerBattle = registerBattleDAO.getDetails(date);
		return registerBattle;
	}

}
