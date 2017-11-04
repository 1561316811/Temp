package com.bjsxt.bbs2009.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	private String username;
	private String password;

	@Override
	public String getText(String aTextName) {
		// TODO Auto-generated method stub
		return super.getText(aTextName);
	}
	
	public String login() throws Exception {
		
		return "success";
	}
	
	public String input() {
		return "input";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

}
