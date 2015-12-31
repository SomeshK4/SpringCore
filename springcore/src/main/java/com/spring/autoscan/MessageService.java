package com.spring.autoscan;

import org.springframework.stereotype.Component;


/**
 *  If you have to get the object of this bean then 
 *  you have to use ctx.getBean("messageService") and 
 *  alternative is that you can define the Component("name") 
 *  and then use that name while getting the object of the bean
 */

@Component
public class MessageService {
	
	public void printMessage(){
		System.out.println("Hello how are you !!");
	}

}
