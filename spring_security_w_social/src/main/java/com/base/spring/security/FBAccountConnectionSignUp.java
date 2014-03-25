package com.base.spring.security;

import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.social.connect.UserProfile;

public class FBAccountConnectionSignUp implements ConnectionSignUp {
	
	private UserDao userDao;
	

	public FBAccountConnectionSignUp(UserDao userDao) {
		super();
		this.userDao = userDao;
	}


	@Override
	public String execute(Connection<?> connection) {
		UserProfile profile = connection.fetchUserProfile();
		
		User user = new User();
		user.setUsername(profile.getUsername());
		user.setRole("ROLE_USER");
		userDao.save(user);
		
		return user.getUserId().toString();
	}

}
