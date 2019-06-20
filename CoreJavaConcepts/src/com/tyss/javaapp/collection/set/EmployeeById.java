package com.tyss.javaapp.collection.set;

import java.util.Comparator;

public class EmployeeById implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		Integer i = o1.getId();
		Integer i1 = o2.getId();
		return i1.compareTo(i);
	}

}
