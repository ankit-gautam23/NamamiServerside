package com.namami.dao;

import com.namami.model.Gallery;

public interface GalleryDAO {
	public Gallery getGallery(String email) throws Exception;
}
