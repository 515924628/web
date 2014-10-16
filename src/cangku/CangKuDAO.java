package cangku;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zpy on 14/10/15.
 *
 */
public class CangKuDAO {
	private final String sqlurl = "jdbc:oracle:thin:@localhost:1521:orcl";
	private final String sqluser = "zpy";
	private final String sqlpwd = "123456";

	public void select() {
		Connection conn = null;
		Statement statement;
		ResultSet rs;
		String sql = "select * from use";
		List<HuoWuBean> list = new ArrayList<HuoWuBean>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(sqlurl, sqluser, sqlpwd);
			statement = conn.createStatement();
			rs = statement.executeQuery(sql);
			int i = 1;
			while (rs.next()){
				System.out.println(i + ":");
				System.out.println("userid=" + rs.getInt("userid"));
				System.out.println("username=" + rs.getString("username"));
				System.out.println("password=" + rs.getString("passowrd"));
				System.out.println("powerid=" + rs.getInt("powerid"));
				System.out.println("deliveryspotid=" + rs.getInt("deliveryspotid"));
				System.out.println("empid=" + rs.getInt("empid"));

				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn == null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		new CangKuDAO().select();
	}
}
