package com.Ioc.test;

import org.apache.ibatis.javassist.bytecode.stackmap.TypeData.ClassName;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Ioc.dao.UserDao;
import com.Ioc.daoImpl.UserDaoImpl;
import com.Ioc.service.UserService;
import com.Ioc.serviceImpl.UserServiceImpl;

public class IocTest {
 
	/**
	 * 
	 * @Author pansw
	 *         <p>
	 *         <li>2020年2月29日-下午8:21:52</li>
	 *         <li>功能说明：面向过程编程，根据逻辑代码去new创建实例对象</li>
	 *         </p>
	 */
	@Test
	public void test() {
		 UserDao  userDao=new UserDaoImpl();
		 userDao.findAll();
	}
	/**
	 * 
	 * @Author pansw
	 *         <p>
	 *         <li>2020年2月29日-下午8:23:56</li>
	 *         <li>功能说明：IOC的xml配置，创建对象交由文件配置。
	 *        </li>
	 *         </p>
	 */
	@Test
	public void test1() {
		  ApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
		  UserDao  userDao=ac.getBean("userDao",UserDao.class);
		  userDao.findAll();
	}
	/**
	 * 
	 * @Author pansw
	 *         <p>
	 *         <li>2020年2月29日-下午8:31:57</li>
	 *         <li>功能说明：使用list的循环</li>
	 *             创建bean三种方式
	 *             默认单例
	 *            1. 使用默认构造函数
	 *            2.使用类中的方法创建对象 存入容器
	 *            3.使用静态方法创建对象 存入容器
	 *         </p>
	 */
	@Test
	public void test2() {
		 ApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
		 UserService  userService=     ac.getBean("userService",UserService.class);
		 System.out.println(userService);
	}
	
	/**
	 * 
	 * @Author pansw
	 *         <p>
	 *         <li>2020年3月1日-下午8:25:12</li>
	 *         <li>功能说明：注解IOC</li>
	 *         </p>
	 */
	@Test
	public void test3() {
		 ApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
		 UserService  userService=     ac.getBean("userService",UserService.class);
		 userService.findAll();
		 System.out.println(userService);
	}

	
	
}
