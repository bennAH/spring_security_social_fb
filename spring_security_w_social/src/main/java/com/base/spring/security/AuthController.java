package com.base.spring.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController extends HomeController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void login() {
	}

}
