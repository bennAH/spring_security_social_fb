package com.base.spring.security;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.web.SignInAdapter;
import org.springframework.web.context.request.NativeWebRequest;

public class PCSignInAdapter implements SignInAdapter {
	private UserDao userDao;
	
	public PCSignInAdapter(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	@Override
	public String signIn(String userId, Connection<?> arg1, NativeWebRequest arg2) {
		Long id = Long.parseLong(userId);
		User user = userDao.findOne(id);
		SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(user.getUsername(), null, null));
		return null;
	}

}
