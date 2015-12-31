package com.spring.core.di;

public class Message {
	
	private MessageGenerator msgGenerator;
	
	
	public Message(MessageGenerator msgGenerator){
		System.out.println("Constructor called");
		this.msgGenerator=msgGenerator;
	}

	public void setMsgGenerator(MessageGenerator msgGenerator) {
		System.out.println("Setter called");
		this.msgGenerator = msgGenerator;
	}
	
	
	public void sayHello(){
		msgGenerator.generateMsg();
	}

}
