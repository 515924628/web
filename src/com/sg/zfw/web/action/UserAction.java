package com.sg.zfw.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	public String login()
	{
		return SUCCESS;
	}
	
	public String register()
	{
		return "success";
	}

}
