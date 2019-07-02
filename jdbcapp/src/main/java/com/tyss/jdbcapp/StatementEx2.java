package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StatementEx2 {
	public static void main(String[] args) {
		String sql = "insert into department_info values(?,?)";

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss_db", "root", "root");) {

			
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, Integer.parseInt(args[0]));
			st.setString(2, args[1]);
			int count = st.executeUpdate();
			System.out.println(count);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
