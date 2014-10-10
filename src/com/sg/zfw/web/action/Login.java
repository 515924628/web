package com.sg.zfw.web.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.sg.zfw.biz.UserBiz;
import com.sg.zfw.biz.impl.UserBizImpl;

public class Login implements Action{
	
	private String username;
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
	private String password;
	
	private UserBiz ubiz= new UserBizImpl();
	public String execute()
	{
		boolean blogin=ubiz.login(username, password);
		if(blogin)
		{
			//ActionContext.getContext().getSession().put("result", result)
			return SUCCESS;
		}else
		{
			
			
			return "error";
		}
	}

}
