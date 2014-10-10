package com.sg.zfw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sg.zfw.bean.House;
import com.sg.zfw.util.ConnectionManager;
import com.sg.zfw.bean.Type;

public class TypeDAO {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public Type getTypeById(int typeid)
	{
		 String sql = "SELECT * FROM TYPE WHERE ID = "+typeid;
		
		 try{ Type type = new Type();
				con = ConnectionManager.getConnection();
				pstmt= con.prepareStatement(sql);
				rs= pstmt.executeQuery();
				while(rs.next())
		         {				 

		             type.setId(rs.getInt("id"));
		            type.setName(rs.getString("NAME"));
          		            
		         }
				 return type;
			}catch(Exception e)
			{
				e.printStackTrace();
				 return null;
			}
			
		
		 
      
        
	}
	
}
