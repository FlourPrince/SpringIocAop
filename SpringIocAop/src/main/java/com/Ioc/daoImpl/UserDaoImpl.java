package com.Ioc.daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.Ioc.dao.UserDao;
import com.Ioc.table.User;

@Repository("userDao")
public class UserDaoImpl  implements UserDao{
	
public UserDaoImpl() {
	System.out.println("UserDaoImpl初始化了");
}
	@Override
	public List<User> findAll() {
		System.out.println("执行UserDaoImpl.findAll");
		
		return null;
	}
 
	
	
}
