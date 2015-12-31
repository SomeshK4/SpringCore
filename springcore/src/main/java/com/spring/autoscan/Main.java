package com.spring.autoscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/autoscan/SpringBeans.xml");
		MessageService msg = (MessageService) ctx.getBean("messageService");
		msg.printMessage();
	}
}
