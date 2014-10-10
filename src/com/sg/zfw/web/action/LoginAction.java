package com.sg.zfw.web.action;

import com.opensymphony.xwork2.Action;
import com.sg.zfw.bean.User1;

/**
 * Created by zpy on 14.10.10.
 */
public class LoginAction implements Action {
	private User1 user;

	public User1 getUser() {
		return user;
	}

	public void setUser(User1 user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		if ("asd".equals(user.getUsername()) && "123".equals(user.getPassword())){
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
}
