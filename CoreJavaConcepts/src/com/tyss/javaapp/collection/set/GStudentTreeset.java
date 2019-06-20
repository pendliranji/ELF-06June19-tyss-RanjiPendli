package com.tyss.javaapp.collection.set;

import java.util.TreeSet;

public class GStudentTreeset {

	public static void main(String[] args) {

		TreeSet<Student> ts = new TreeSet<>();

		Student s1 = new Student();
		s1.setId(10);
		s1.setName("ranji");
		s1.setPercentage(58.9);

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("pendli");
		s2.setPercentage(78.2);
		Student s3 = new Student();
		s3.setId(3);
		s3.setName("bujji");
		s3.setPercentage(58.2);

		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		for (Student s : ts) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getPercentage());
			System.out.println("----------------------------------------");
		}

	}

}
