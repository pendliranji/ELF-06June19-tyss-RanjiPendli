package com.tyss.javaapp.collection.set;

import java.util.TreeSet;

public class EmployeeTreeSetComparator {
	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("ranji");
		e1.setSalary(6.9);

		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("sari");
		e2.setSalary(6.3);

		Employee e3 = new Employee();
		e3.setId(3);
		e3.setName("bujji");
		e3.setSalary(6.6);
		TreeSet<Employee> ts = new TreeSet<>(new EmployeeComparatorByName());// pass comparator object to sort Treeset
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
//Collections.sort(ts,new EmployeeComparator());
		for (Employee e : ts) {
			System.out.println(e.getName());
			System.out.println(e.getId());
			System.out.println(e.getSalary());
			System.out.println("---------------------------");
		}

	}

}
