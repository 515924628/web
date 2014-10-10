package com.sg.zfw.biz.impl;

import com.sg.zfw.biz.UserBiz;

public class UserBizImpl implements UserBiz {

	public boolean login(String name, String pwd) {
		boolean ret = false;
		if("admin".equals(name)&&"123".equals(pwd))
		{
			ret=true;
		}
		return ret;
	}

}
