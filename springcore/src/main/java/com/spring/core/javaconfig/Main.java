package com.spring.core.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloBean");
		helloWorld.sayHello("somesh");
	}

}
