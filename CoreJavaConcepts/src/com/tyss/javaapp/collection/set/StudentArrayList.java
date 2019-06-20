package com.tyss.javaapp.collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class StudentArrayList {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<>();

		Student s1 = new Student();
		s1.setId(10);
		s1.setName("ranji");
		s1.setPercentage(58.2);

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("pendli");
		s2.setPercentage(78.2);
		Student s3 = new Student();
		s3.setId(3);
		s3.setName("bujji");
		s3.setPercentage(58.2);

		al.add(s1);
		al.add(s2);
		al.add(s3);

		Iterator<Student> it = al.iterator();
		System.out.println("---------------Forward-------------------------");
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getPercentage());
			System.out.println("----------------------------------------");
		}

		ListIterator<Student> lit = al.listIterator(al.size());
		System.out.println("----------------------------------------");
		System.out.println("----------------Backward----------------------");
		System.out.println("----------------------------------------");
		while (lit.hasPrevious()) {
			Student s = lit.previous();
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getPercentage());
			System.out.println("----------------------------------------");
		}

		Collections.sort(al);
		System.out.println("----------------------------------------");
		System.out.println("AFTER SORTING");
		System.out.println("----------------------------------------");
		for (Student s : al) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getPercentage());
			System.out.println("----------------------------------------");

		}
	}

}
