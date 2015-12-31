package com.spring.initdestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class CustomerService {

	private String message;

	public CustomerService() {
		System.out.println("bean initialized");
		// TODO Auto-generated constructor stub
	}

	public void setMessage(String message) {
		System.out.println("Setter called");
		this.message = message;
	}

	public void printMessage() {
		System.out.println("Hello how are you : " + message);
	}

	@PostConstruct
	public void initIt() throws Exception {
		System.out.println("Init method after properties are set : " + message);
	}

	@PreDestroy
	public void cleanUp() throws Exception {
		System.out.println("Spring Container is destroy! Customer clean up");
	}

}
