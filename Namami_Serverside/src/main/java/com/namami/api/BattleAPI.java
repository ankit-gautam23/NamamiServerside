package com.namami.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.namami.model.Battle;
import com.namami.service.BattleService;

@CrossOrigin
@RestController
@RequestMapping("BattleAPI")
public class BattleAPI {

	@Autowired
	private BattleService battleService;
	
	@Autowired
	private Environment environment;
	
	@RequestMapping(value = "/getBattleDetails/{bid}", method = RequestMethod.GET)
	public ResponseEntity<Battle> getBattleDetails(@PathVariable Integer bid) {

		try {
			Battle battle = battleService.getBattleDetail(bid);
			return new ResponseEntity<Battle>(battle, HttpStatus.OK);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, environment.getProperty(e.getMessage()));
		}
	}

}
