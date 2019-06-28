package com.tyss.javaapp.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayTestEx {

	Comparator<Student> com = (ii, jj) -> ii.getPercentage().compareTo(jj.getPercentage());

	public Student getTopper(ArrayList<Student> al) {
		Student li = al.stream().max(com).get();
		return li;
	}

	public Student getLowest(ArrayList<Student> all) {
		Student li = all.stream().min(com).get();
		return li;
	}

	public static void main(String[] args) {

		Student s1 = new Student("anjali", 1, 85.0);
		Student s2 = new Student("sanju", 1, 185.0);
		Student s3 = new Student("manju", 1, 85.0);
		Student s4 = new Student("ram", 1, 555.0);
		Student s5 = new Student("tej", 1, 75.0);

		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		// Collections.sort(al, com);
		Comparator<Student> com = (i, j) -> i.getPercentage().compareTo(j.getPercentage());
		List<Student> list = al.stream().sorted(com).collect(Collectors.toList());

		for (Student student : list) {
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getPercentage());
			System.out.println("------------------");
		}
		Student sss = Collections.max(al, com);
		System.out.println("highest ::" + sss);

		System.out.println("-----------Highest percentage----------------");
		Student li = al.stream().max(com).get();
		System.out.println(li.getId());
		System.out.println(li.getName());
		System.out.println(li.getPercentage());

		ArrayTestEx ss = new ArrayTestEx();
		Student stu = ss.getTopper(al);
		Student student = ss.getLowest(al);
		System.out.println("Max percent ::" + stu);
		System.out.println("Min percent ::" + student);
	}

}
