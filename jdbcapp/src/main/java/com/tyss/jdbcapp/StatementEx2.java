package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class StatementEx2 {
	public static void main(String[] args) {
		String sql = "insert into department_info values(?,?)";
		String sql2 = "select * from employee_info where id=1";

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss_db", "root", "root");) {

			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, Integer.parseInt(args[0]));
			st.setString(2, args[1]);
			int count = st.executeUpdate();
			if (count > 0) {
				System.out.println(count);
			}
			PreparedStatement pst = con.prepareStatement(sql2);
			ResultSet rs = pst.executeQuery();
			rs.next();
			Date d = rs.getDate("joining_date");
			System.out.println(d);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
