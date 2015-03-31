package com.struts.helloworld;

public class MessageStore {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MessageStore() {
		super();
		setMessage("Hello struts ¹ş¹ş¹ş");
	}
	
	
	

}
