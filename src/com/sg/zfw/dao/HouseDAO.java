package com.sg.zfw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sg.zfw.bean.House;
import com.sg.zfw.util.ConnectionManager;

public class HouseDAO {

	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	public List getAllHouse()
	{
		List list= new ArrayList();
		
		TypeDAO td= new TypeDAO();
		
		String  sql="select * from HOUSE";
		
		try{
			con = ConnectionManager.getConnection();
			pstmt= con.prepareStatement(sql);
			rs= pstmt.executeQuery();
			//逐行读取数据
			while(rs.next())
			{
				House house= new House();
				house.setId(rs.getInt("id"));
				house.setTitle(rs.getString("TITLE"));
				house.setContact(rs.getString("contact"));
				house.setDescription(rs.getString("description"));
				house.setFloorage(rs.getInt("floorage"));
				house.setPrice(rs.getDouble("price"));
			
				house.setDate(rs.getDate("date"));				
			    int typeid= rs.getInt("TYPE_ID");
			    int userid= rs.getInt("USER_ID");
			    int streetid=  rs.getInt("STREET_ID");
			    
				house.setType(td.getTypeById(typeid));
				
				list.add(house);
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try{
				if(rs!=null)
				{
					rs.close();
				}
				if(pstmt!=null)
				{
					pstmt.close();
				}
				if(con!=null)
				{
					con.close();
				}
			}catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
		return list;
	}
}
