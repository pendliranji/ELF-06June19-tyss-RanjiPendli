package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tyss.jdbcapp.pool.ConnectionPool;

/**
 * Jdbc Connection !
 *
 */
public class App {
	public static void main(String[] args) {
		String sql = "select * from employee_info" + " where id=10";
		System.out.println(sql);
		// DriverManager.registerDriver(new Driver());
		// Class.forName("com.mysql.jdbc.Driver");// OR we can use this
		

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss_db", "root", "root");
				Statement st = con.createStatement();
				ResultSet resultset = st.executeQuery(sql);) {

			System.out.println("************** Employee Details *************");

			if (resultset != null || resultset.equals("")) {
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
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
