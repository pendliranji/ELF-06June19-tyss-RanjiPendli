package com.tyss.javaapp.array.bean;

import lombok.Data;

@Data
public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private double salary;

	@Override
	public int compareTo(Employee o) {
		/*
		 * if (o.getId() < getId()) { return 1; } return 0;
		 */
		return getName().compareTo(o.getName());
	}

}
