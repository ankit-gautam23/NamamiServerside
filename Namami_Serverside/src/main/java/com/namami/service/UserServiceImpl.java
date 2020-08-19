package com.namami.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.namami.dao.UserDAO;
import com.namami.model.Users;

@Service(value = "userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public Users getUserByContact(String contact) throws Exception {
		Users user = userDAO.getUserByContact(contact);
		return user;
	}
	
}
