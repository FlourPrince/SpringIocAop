package com.Ioc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ioc.dao.UserDao;
import com.Ioc.service.UserService;
import com.Ioc.table.User;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	/*
	 * public UserServiceImpl() {
	 * 
	 * } public UserServiceImpl (UserDao userDao) { System.out.println(userDao);
	 * this.userDao=userDao; }
	 */
  public UserServiceImpl() {
	  System.out.println("UserServiceImpl初始化了");
  }
	@Override
	public List<User> findAll () {
		userDao.findAll();
		System.out.println("UserServiceImpl.findAll");
		
		return null;
	}
	

}
