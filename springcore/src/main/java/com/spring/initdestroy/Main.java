package com.spring.initdestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/initdestroy/SpringBeans.xml");
	CustomerService cust = (CustomerService) ctx.getBean("cust");
	cust.printMessage();
	
	
	/**
	 * Use ConfigurableApplicatonContext to use close method so that 
	 * destroy method will be called
	 */
	
	ConfigurableApplicationContext ctx1 = new ClassPathXmlApplicationContext("com/spring/initdestroy/SpringBeans.xml");
	CustomerService cust1 = (CustomerService) ctx1.getBean("cust");
	cust1.printMessage();
	
	ctx1.close();
	
	}

}
