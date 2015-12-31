package com.spring.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Autowired
	@Qualifier("add")
	private Address address1;
	
	
	public void setAddress(Address address1) {
		this.address1 = address1;
	}

	public void printAddress(){
		System.out.println("City :"+address1.getCity());
		System.out.println("Country : "+address1.getCountry());
	}

}
