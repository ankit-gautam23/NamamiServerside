package com.namami.dao;

import com.namami.model.Users;

public interface UserDAO {
	public Users getUserByContact(String Contact) throws Exception;
}
