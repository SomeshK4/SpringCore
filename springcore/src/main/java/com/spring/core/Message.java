package com.spring.core;

/**
 * Spring bean!
 *
 */
public class Message 
{
    
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHello(){
		System.out.println("Spring 3 Hello ! "+name);
	}
	
}
