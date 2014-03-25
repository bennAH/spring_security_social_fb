package com.base.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserAuthProvider implements UserDetailsService {
	
	@Autowired
	private UserDao userDao;
	
	public UserAuthProvider() {
		
	}

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		User user = userDao.findByUsername(username);
		user.setRoles();
		return user;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
