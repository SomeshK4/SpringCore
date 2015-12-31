package com.spring.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("add")
public class Address {
	private String city;
	private String country;
	
	public String getCity() {
		return city;
	}
	
	@Value("Chandigarh")
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public String getCountry() {
		return country;
	}
	
	@Value("India")
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
