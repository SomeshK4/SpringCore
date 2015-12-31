package com.spring.multipleconfig;

public class Message {
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHello(){
		System.out.println("Hello how are you : "+name);
	}
}
