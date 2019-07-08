package com.tyss.designpattern.builder;

public class EmployeeDataBuilderTest {
	public static void main(String[] args) {

		EmployeeData2 data = new EmployeeData2.EmployeeData2Builder().id(1).name("ranjith").age(24).build();

		System.out.println(data);

		EmployeeData3 data1 = new EmployeeData3.EmployeeData3Builder().id(2).name("ranjith").age(24).salary(56.3)
				.email("ranji.pendli@gmail.com").gender("male").build();
		System.out.println(data1);
	}

}
