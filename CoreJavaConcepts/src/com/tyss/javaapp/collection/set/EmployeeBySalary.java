package com.tyss.javaapp.collection.set;

import java.util.Comparator;

public class EmployeeBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		Double d1 = o1.getSalary();
		Double d2 = o2.getSalary();

		return d1.compareTo(d2);
	}

}
