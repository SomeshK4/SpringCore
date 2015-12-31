package com.spring.multipleconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/multipleconfig/SpringMain.xml");
		Message msg = (Message) ctx.getBean("msg");
		msg.sayHello();
		
	}

}
