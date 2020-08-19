package com.namami.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.namami.entity.UserEntity;
import com.namami.model.Users;

@Repository(value = "userDAO")
public class UserDAOImpl implements UserDAO{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public Users getUserByContact(String contact) throws Exception {
		
		Query query = entityManager.createQuery("select u from UserEntity u where u.contact = :contact");
		query.setParameter("contact", contact);
		Users user = null;
		List<UserEntity> userEntities = query.getResultList();
		if(!userEntities.isEmpty()) {
			UserEntity userEntity = userEntities.get(0);
			user = new Users();
			user.setName(userEntity.getName());
			user.setCity(userEntity.getCity());
			user.setContact(userEntity.getContact());
			user.setDob(userEntity.getDob());
			user.setEmailid(userEntity.getEmailid());
			user.setGender(userEntity.getGender());
			user.setPassword(userEntity.getPassword());
		}
		return user;
	}
	
}
