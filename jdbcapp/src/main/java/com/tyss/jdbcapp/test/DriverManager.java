package com.tyss.jdbcapp.test;

public class DriverManager {

	private DriverManager() {

	}

	public static Connection getConnection(String msg) {
		Connection ref = null;
		if (msg.equalsIgnoreCase("myinterface1")) {
			ref = new MyInterfaceImpl1();
		} else if (msg.equalsIgnoreCase("myinterface2")) {
			ref = new MyInterfaceImpl2();
		}
		return ref;
	}
}
