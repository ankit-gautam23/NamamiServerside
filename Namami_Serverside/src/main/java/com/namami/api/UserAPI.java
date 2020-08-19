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

import com.namami.model.Users;
import com.namami.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("UserAPI")
public class UserAPI {

	@Autowired
	private UserService userService;

	@Autowired
	private Environment environment;
	
	@RequestMapping(value = "/getUser/{contact}", method = RequestMethod.GET)
	public ResponseEntity<Users> getUser(@PathVariable String contact) {

		try {
			Users user = userService.getUserByContact(contact);
			return new ResponseEntity<Users>(user, HttpStatus.OK);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, environment.getProperty(e.getMessage()));
		}
	}

}
