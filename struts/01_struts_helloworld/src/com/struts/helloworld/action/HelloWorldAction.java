package com.struts.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.helloworld.MessageStore;

public class HelloWorldAction extends ActionSupport{

	
	private static final long serialVersionUID = 1L;
	private MessageStore messageStore;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		messageStore=new MessageStore();
		 return SUCCESS;
	}

	public MessageStore getMessageStore() {
		return messageStore;
	}

	public void setMessageStore(MessageStore messageStore) {
		this.messageStore = messageStore;
	}
	
	

}
