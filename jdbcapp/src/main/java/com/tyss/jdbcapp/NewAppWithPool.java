package com.tyss.jdbcapp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tyss.jdbcapp.pool.ConnectionPool;

public class NewAppWithPool {

	public static void main(String[] args) {
		String sql = "select * from employee_info" + " where id=1";
		ConnectionPool conPool = null;
		Connection con = null;
		try {
			conPool = ConnectionPool.getConnectionPool();
			con = conPool.getConnection();
			Statement st = con.createStatement();
			ResultSet resultset = st.executeQuery(sql);

			System.out.println("************** Employee Details *************");

			while (resultset.next()) {
				System.out.println("Id 			 :" + resultset.getInt(1));
				System.out.println("Name 		 :" + resultset.getString(2));
				System.out.println("age 		 :" + resultset.getInt(3));
				System.out.println("Email 		 :" + resultset.getString(4));
				System.out.println("Gender		 :" + resultset.getString(5));
				System.out.println("Salary 		 :" + resultset.getDouble(6));
				System.out.println("Phone 		 :" + resultset.getInt(7));
				System.out.println("Joining Date :" + resultset.getDate(8));
				System.out.println("Designation  :" + resultset.getString(9));
				System.out.println("DOB        	 :" + resultset.getDate(10));
				System.out.println("Account No 	 :" + resultset.getInt(11));
				System.out.println("DEpt id    	 :" + resultset.getInt(12));
				System.out.println("Manager Id 	 :" + resultset.getInt(13));
				System.out.println("-------------------------");

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (con != null) {
				conPool.returnConnection(con);
			}
		}

	}
}
