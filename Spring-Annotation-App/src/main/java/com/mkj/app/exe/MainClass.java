package com.mkj.app.exe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkj.app.beans.Account;
import com.mkj.app.config.MySpringConfig;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext spring = new ClassPathXmlApplicationContext("spring.xml");
		
		// Account a = (Account)spring.getBean("account"); // gives error as account bean is not available
		Account a = (Account)spring.getBean("a3");
		System.out.println(a);
		
		/*
		ApplicationContext spring2 = new AnnotationConfigApplicationContext(MySpringConfig.class);
		Account a2 = (Account)spring.getBean("getAccount()");
		System.out.println(a2);
		
		*/
		
	}
}
