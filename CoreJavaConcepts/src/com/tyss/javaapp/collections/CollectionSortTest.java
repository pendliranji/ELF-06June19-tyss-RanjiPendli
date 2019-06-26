package com.tyss.javaapp.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class CollectionSortTest {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "ranji", 250, 56.3);
		Employee e2 = new Employee(5, "pendli", 250, 75.32);
		Employee e3 = new Employee(4, "bujji", 250, 55.1);
		Employee e4 = new Employee(2, "ram", 250, 58.1);

		Comparator<Employee> ce = (o1, o2) -> o1.getId().compareTo(o2.getId());// sort by id
		Comparator<Employee> ce1 = (o1, o2) -> o1.getName().compareTo(o2.getName());// sort by name
		Comparator<Employee> ce2 = (o1, o2) -> o2.getPercent().compareTo(o1.getPercent());// sort by percentage

		TreeSet<Employee> al = new TreeSet<>(ce2);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);

		for (Employee emp : al) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
			System.out.println(emp.getPercent());
			System.out.println("---------------");
		}

	}

}
