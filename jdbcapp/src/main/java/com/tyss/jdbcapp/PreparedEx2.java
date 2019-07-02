package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedEx2 {
	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss_db", "root", "root");) {

			
			
			PreparedStatement st = con.prepareStatement("select * from employee_info where id=? and mngr_id=?");
			st.setInt(1, Integer.parseInt(args[0]));
			st.setInt(2, Integer.parseInt(args[1]));
			ResultSet result = st.executeQuery();
			System.out.println("************** Employee Details *************");
			while (result.next()) {
				System.out.println("Id 			 :" + result.getInt(1));
				System.out.println("Name 		 :" + result.getString(2));
				System.out.println("age 		 :" + result.getInt(3));
				System.out.println("Email 		 :" + result.getString(4));
				System.out.println("Gender		 :" + result.getString(5));
				System.out.println("Salary 		 :" + result.getDouble(6));
				System.out.println("Phone 		 :" + result.getInt(7));
				System.out.println("Joining Date :" + result.getDate(8));
				System.out.println("Designation  :" + result.getString(9));
				System.out.println("DOB        	 :" + result.getDate(10));
				System.out.println("Account No 	 :" + result.getInt(11));
				System.out.println("DEpt id    	 :" + result.getInt(12));
				System.out.println("Manager Id 	 :" + result.getInt(13));
				System.out.println("-------------------------");

			}

		} catch (Exception e) {

		}
	}

}
