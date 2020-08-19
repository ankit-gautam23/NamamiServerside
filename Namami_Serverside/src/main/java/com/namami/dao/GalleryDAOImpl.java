package com.namami.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.namami.entity.GalleryEntity;
import com.namami.model.Gallery;

@Repository(value = "galleryDAO")
public class GalleryDAOImpl implements GalleryDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public Gallery getGallery(String email) throws Exception {
		Query query = entityManager.createQuery("select g from GalleryEntity g where g.email = :email");
		query.setParameter("email", email);
		Gallery gallery = null;
		List<GalleryEntity> galleryEntities = query.getResultList();
		if(!galleryEntities.isEmpty()) {
			GalleryEntity galleryEntity = galleryEntities.get(0);
			gallery = new Gallery();
			gallery.setEmail(galleryEntity.getEmail());
			gallery.setImgsurl(galleryEntity.getImgsurl());
		}
		
		return gallery;
	}
	
}
