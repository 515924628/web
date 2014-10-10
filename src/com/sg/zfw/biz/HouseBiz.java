package com.sg.zfw.biz;

import java.util.List;

import com.sg.zfw.bean.House;

public interface HouseBiz {

	/**
	 * @return List 
	 * 返回所有租房信息
	 */
	public List<House> getAllHouse();

}
