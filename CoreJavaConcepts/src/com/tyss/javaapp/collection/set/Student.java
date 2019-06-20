package com.tyss.javaapp.collection.set;

import lombok.Data;

@Data
public class Student implements Comparable<Student> {

	String name;
	int id;
	double percentage;

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.getName());
	}

	/*
	 * Logic to sort wrt id
	 * 
	 * / * @Override public int compareTo(Student o) { if (this.id > o.getId()) {
	 * return 1; } else { return -1; } }
	 */

	/*
	 * Logic to sort w.r.t percentage
	 * 
	 * @Override public int compareTo(Student o) {
	 * 
	 * if (this.percentage < o.getPercentage()) return 1; else return -1; }
	 */

}
