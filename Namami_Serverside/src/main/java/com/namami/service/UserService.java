package com.namami.service;

import com.namami.model.Users;

public interface UserService {
	public Users getUserByContact(String contact) throws Exception;
}
