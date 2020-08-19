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

import com.namami.model.Gallery;
import com.namami.model.Users;
import com.namami.service.GalleryService;

@CrossOrigin
@RestController
@RequestMapping("GalleryAPI")
public class GalleryAPI {

	@Autowired
	private GalleryService galleryService;
	
	@Autowired
	private Environment environment;
	
	@RequestMapping(value = "/getGallery/{email}", method = RequestMethod.GET)
	public ResponseEntity<Gallery> getGallery(@PathVariable String email) {

		try {
			Gallery gallery = galleryService.getGallery(email);
			return new ResponseEntity<Gallery>(gallery, HttpStatus.OK);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, environment.getProperty(e.getMessage()));
		}
	}

}
