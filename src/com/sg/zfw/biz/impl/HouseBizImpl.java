package com.sg.zfw.biz.impl;

import java.util.List;

import com.sg.zfw.bean.House;
import com.sg.zfw.biz.HouseBiz;
import com.sg.zfw.dao.HouseDAO;

public class HouseBizImpl implements HouseBiz {
	private HouseDAO hd = new HouseDAO();
	public List<House> getAllHouse() {
	
			List<House> result = hd.getAllHouse();
			return result;
		}
	}


