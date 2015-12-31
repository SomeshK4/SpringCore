package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/core/SpringBeans.xml");
		Message msg = (Message) ctx.getBean("message");
		msg.sayHello();
	}
}
