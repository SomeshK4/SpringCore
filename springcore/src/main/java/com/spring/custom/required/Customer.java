package com.spring.custom.required;

public class Customer {
	
	private String name;

	@Mandatory
	public void setName(String name) {
		this.name = name;
	}
	
	public void printMessage(){
		System.out.println("Hello : "+name);
	}

}
