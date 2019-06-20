package com.tyss.javaapp.array;

public class Array2Copy {

	public static void main(String[] args) {
		int[] copy = { 1, 2, 3, 4, 4, 5, 6 };
		int[] c2 = { 12, 13, 14, 15, 16, 17 };

		for (int i = 0; i < c2.length - 2; i++) {
			c2[i + 2] = copy[i];

		}
		for (int i = 0; i < c2.length; i++) {

			System.out.println(c2[i]);
		}
		/*
		 * int [] copy1; copy1 = copy; for (int i = 0; i < copy1.length; i++) {
		 * System.out.println(copy1[i] + "--copied successfully"); } int[] copy2 =
		 * Arrays.copyOf(copy, copy.length); for (int j = 0; j < copy2.length; j++) {
		 * System.out.println(copy2[j]); } for(int k:copy2) { System.out.println(k); }
		 */
	}

}
