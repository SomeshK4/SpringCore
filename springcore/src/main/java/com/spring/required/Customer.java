package com.spring.required;

import org.springframework.beans.factory.annotation.Required;

public class Customer {
	
	private String name;
	private int id;
	
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void printCustomer(){
		System.out.println("Customer with id :"+id+" and name :"+name);
	}

}
