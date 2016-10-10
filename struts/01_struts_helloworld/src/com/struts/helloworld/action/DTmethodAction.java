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
		System.out.println("进入添加页面");
		return "add_input";
	}
	public String add(){
		System.out.println("执行添加操作 ");
		return "add_success";
	}
	
	
	public String updateInput(){
		System.out.println("进入更新页面");
		return "update_input";
	}
	public String update(){
		System.out.println("执行更新操作 ");
		return "update_success";
	
	}
	
	public String delete(){
		System.out.println("执行删除操作 ");
		return "delete_success";
	
	}
	

}
