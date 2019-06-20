package com.tyss.javaapp.array.test;

import java.util.Arrays;

import com.tyss.javaapp.array.bean.Employee;

public class Test {

	public static void main(String[] args) {
		Employee[] e = new Employee[4];
		Employee e1 = new Employee();
		e1.setId(23);
		e1.setName("ranji");
		e1.setSalary(6.3);

		Employee e2 = new Employee();
		e2.setId(24);
		e2.setName("sari");
		e2.setSalary(6.3);
		Employee e3 = new Employee();
		e3.setId(25);
		e3.setName("bujji");
		e3.setSalary(6.3);
		Employee e4 = new Employee();
		e4.setId(26);
		e4.setName("pendli");
		e4.setSalary(6.3);
		e[0] = e1;
		e[1] = e2;
		e[2] = e3;
		e[3] = e4;
		System.out.println("----------");

		Arrays.sort(e);
		for (Employee emp : e) {
			System.out.println("ID :" + emp.getId());
			System.out.println("Name :" + emp.getName());
			System.out.println("Salary :" + emp.getSalary());
			System.out.println("-------------");
		}

	}
}
