package com.tyss.jdbcapp.test;

public class MyInterfaceTest {

	public static void main(String[] args) {

		/*
		 * MyInterface myInterface = new MyInterfaceImpl1(); MyInterface myInterface2 =
		 * new MyInterfaceImpl2();
		 * 
		 * myInterface.met(); myInterface2.met();
		 */

		Connection mc = DriverManager.getConnection(args[0]);
		mc.met();
	}

}
