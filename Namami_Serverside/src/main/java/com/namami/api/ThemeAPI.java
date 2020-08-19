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

import com.namami.model.Theme;
import com.namami.model.Users;
import com.namami.service.ThemeService;

@CrossOrigin
@RestController
@RequestMapping("ThemeAPI")
public class ThemeAPI {

	@Autowired
	private ThemeService themeService;
	
	@Autowired
	private Environment environment;
	
	@RequestMapping(value = "/getTheme/{tdate}", method = RequestMethod.GET)
	public ResponseEntity<List<Theme>> getTheme(@PathVariable String tdate) {

		try {
			
			List<Theme> theme = themeService.getThemeByDate(tdate);
			return new ResponseEntity<List<Theme>>(theme, HttpStatus.OK);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, environment.getProperty(e.getMessage()));
		}
	}

}
