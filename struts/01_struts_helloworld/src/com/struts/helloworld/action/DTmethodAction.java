package com.struts.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.helloworld.MessageStore;

public class DTmethodAction extends ActionSupport{

	
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

	public String addInput(){
		System.out.println("�������ҳ��");
		return "add_input";
	}
	public String add(){
		System.out.println("ִ����Ӳ��� ");
		return "add_success";
	}
	
	
	public String updateInput(){
		System.out.println("�������ҳ��");
		return "update_input";
	}
	public String update(){
		System.out.println("ִ�и��²��� ");
		return "update_success";
	
	}
	
	public String delete(){
		System.out.println("ִ��ɾ������ ");
		return "delete_success";
	
	}
	

}
