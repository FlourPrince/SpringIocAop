package com.Ioc.tools;

import com.Ioc.service.UserService;
import com.Ioc.serviceImpl.UserServiceImpl;

public class FactoryBean {

	
	public UserService getBean() {
		
		return new UserServiceImpl();
	}
	
}
