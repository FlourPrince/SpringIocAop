package com.Ioc.test;


public class AdviceAop {

	public void adviceBefore() {
		System.out.println("前置通知");
	}
	
	public void adviceAfter() {
		System.out.println("后置通知");
	}
	
	public void adviceAfterReturn() {
		System.out.println("返回通知");
	}
	
	public void adviceAfterThrow() {
		System.out.println("报错通知");
	}
}
