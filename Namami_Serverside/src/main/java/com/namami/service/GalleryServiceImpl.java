package com.namami.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namami.dao.GalleryDAO;
import com.namami.model.Gallery;
@Service(value = "galleryService")
@Transactional
public class GalleryServiceImpl implements GalleryService{

	@Autowired
	private GalleryDAO galleryDAO;
	
	@Override
	public Gallery getGallery(String email) throws Exception {
		Gallery gallery = galleryDAO.getGallery(email);
		return gallery;
	}
}
