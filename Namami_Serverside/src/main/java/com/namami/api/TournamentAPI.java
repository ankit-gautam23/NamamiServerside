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

import com.namami.model.Tournament;
import com.namami.service.TournamentService;

@CrossOrigin
@RestController
@RequestMapping("TournamentAPI")
public class TournamentAPI {

	@Autowired
	private TournamentService tournamentService;
	
	@Autowired
	private Environment environment;
	
	@RequestMapping(value = "/getDetails/{tdate}", method = RequestMethod.GET)
	public ResponseEntity<List<Tournament>> getDetails(@PathVariable String tdate) {

		try {
			List<Tournament> tou = tournamentService.getDetails(tdate);
			return new ResponseEntity<List<Tournament>>(tou, HttpStatus.OK);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, environment.getProperty(e.getMessage()));
		}
	}

	
}
