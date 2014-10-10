package com.sg.zfw.web.action;

import java.util.List;
import java.util.Map;



import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;
import com.sg.zfw.bean.House;
import com.sg.zfw.biz.HouseBiz;
import com.sg.zfw.biz.impl.HouseBizImpl;
public class Manage extends ActionSupport {
	
	public String execute() throws Exception{
		ActionContext ac = ActionContext.getContext();
		Map session = ac.getSession();
		HouseBiz hb =new HouseBizImpl();
		List<House> result = hb.getAllHouse();
		session.put("result", result);		
		return SUCCESS;
	}

}
