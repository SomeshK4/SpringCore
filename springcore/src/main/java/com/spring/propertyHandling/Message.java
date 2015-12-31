package com.spring.propertyHandling;

public class Message {
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printMessage(){
		System.out.println("Hello :"+name);
	}
	
}
