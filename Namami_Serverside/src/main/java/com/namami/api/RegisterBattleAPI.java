package com.namami.api;

import java.util.List;

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

import com.namami.model.RegisterBattle;
import com.namami.service.RegisterBattleService;


@CrossOrigin
@RestController
@RequestMapping("RegisterBattleAPI")
public class RegisterBattleAPI {

	@Autowired
	private RegisterBattleService registerBattleService;
	
	@Autowired
	private Environment environment;
	
	
	@RequestMapping(value = "/getDetails/{date}", method = RequestMethod.GET)
	public ResponseEntity<List<RegisterBattle>> getDetails(@PathVariable String date) {

		try {
			List<RegisterBattle> registerBattle = registerBattleService.getDetails(date);
			return new ResponseEntity<List<RegisterBattle>>(registerBattle, HttpStatus.OK);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, environment.getProperty(e.getMessage()));
		}
	}

}
