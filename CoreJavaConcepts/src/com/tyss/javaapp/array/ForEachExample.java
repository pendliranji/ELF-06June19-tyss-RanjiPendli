package com.tyss.javaapp.array;

public class ForEachExample {
	public static void main(String[] args) {

		int [] a = { 1, 22, 5, 5, 5, 8 };
		double [] d = { 2.1, 3.2, 6.6, 9.9, 3.3 };
		String [] s = { "ranji", "sari", "bujji", "cherry" };
		System.out.println("-------------------");
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("-------------------");
		for (double i : d) {
			System.out.println(i);
		}
		System.out.println("-------------------");
		for (String i : s) {
			System.out.println(i);
		}

	}

}
