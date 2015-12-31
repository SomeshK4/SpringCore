package com.spring.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/required/SpringBeans.xml");
		Customer customer = (Customer) ctx.getBean("cust");
		customer.printCustomer();
	}
}
