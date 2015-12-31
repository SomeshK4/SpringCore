package com.spring.custom.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/custom/required/SpringBeans.xml");
		Customer cust = (Customer) ctx.getBean("cust");
		cust.printMessage();
	}

}
