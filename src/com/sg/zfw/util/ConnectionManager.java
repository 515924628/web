package com.sg.zfw.util;
import java.sql.*;
public class ConnectionManager {
	
	public static synchronized Connection getConnection()
	{
		String driverClassName=Env.getInstance().getProperty("driver");
		String url= Env.getInstance().getProperty("url");
		String user=Env.getInstance().getProperty("user");
		String pwd= Env.getInstance().getProperty("password");
		
		Connection con=null;
		
		try {
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url,user,pwd);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}

}
