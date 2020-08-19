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

import com.namami.model.CustomBattle;
import com.namami.service.CustomBattleService;

@CrossOrigin
@RestController
@RequestMapping("CustomBattleAPI")
public class CustomBattleAPI {
	
	@Autowired
	private CustomBattleService customBattleService;
	
	@Autowired
	private Environment environment;
	
	@RequestMapping(value = "/getBattleDetails/{theme}", method = RequestMethod.GET)
	public ResponseEntity<List<CustomBattle>> getBattleDetails(@PathVariable String theme) {

		try {
			List<CustomBattle> cbattle = customBattleService.getBattleDetails(theme);
			return new ResponseEntity<List<CustomBattle>>(cbattle, HttpStatus.OK);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, environment.getProperty(e.getMessage()));
		}
	}

}
