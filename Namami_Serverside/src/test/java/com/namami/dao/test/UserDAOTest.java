package com.namami.dao.test;



import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.transaction.annotation.Transactional;

import com.namami.dao.UserDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
@Rollback(true)
public class UserDAOTest {

	@Autowired
	UserDAO userDAO;

	@Test
	public void invalidLogin()throws Exception{
		Assert.assertNull(userDAO.getUserByContact("8889898989"));
	}
	
	@Test
	public void validLogin()throws Exception{
		Assert.assertNotNull(userDAO.getUserByContact("8884967823"));
	}
	
}
