package com.namami.service.test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.namami.dao.UserDAO;
import com.namami.model.Users;
import com.namami.service.UserServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	
	@Mock 
	UserDAO userDAO;
	
	@InjectMocks
	UserServiceImpl serviceImpl;
	
	
	@Rule
	public ExpectedException  ee = ExpectedException.none();	
	
	@Test
	public void invalidLoginInvalidUser()throws Exception{
		ee.expect(Exception.class);
		ee.expectMessage("UserService.INVALID_CREDENTIALS");
		Users users = null;
		when(userDAO.getUserByContact(anyString())).thenReturn(users);
		serviceImpl.getUserByContact("8889765465");
	}
	
	@Test
	public void invalidLoginNullPassword()throws Exception{
		ee.expect(Exception.class);
		ee.expectMessage("UserService.INVALID_CREDENTIALS");
		Users users = new Users();
		users.setPassword(null);
		when(userDAO.getUserByContact(anyString())).thenReturn(users);
		serviceImpl.getUserByContact("8889765465");
	}
	
	@Test
	public void invalidLoginInvalidPassword()throws Exception{
		ee.expect(Exception.class);
		ee.expectMessage("UserService.INVALID_CREDENTIALS");
		Users users = new Users();
		users.setPassword("abc");
		when(userDAO.getUserByContact(anyString())).thenReturn(users);
		serviceImpl.getUserByContact("8889765465");
	}
	
	@Test
	public void validLogin()throws Exception{
		Users expected = new Users();
		expected.setPassword("3284cbd43ac6fc733d7c3d2176e7a52bbaeba81471702ec332a0a65689cf16e3");
		expected.setContact("8884967823");
		when(userDAO.getUserByContact(anyString())).thenReturn(expected);
		Users actual=serviceImpl.getUserByContact("8889765465");
		Assert.assertEquals(expected.getContact(), actual.getContact());
	}

}
