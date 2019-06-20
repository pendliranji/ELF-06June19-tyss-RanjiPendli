package com.tyss.javaapp.array;

public class ArryExample2 {
	public static void main(String[] args) {
		int[] copy = { 1, 2, 3, 4, 4, 5, 6 };
		int[] c2 = { 12, 13, 14, 15, 16, 17 };
		/*
		 * int dest = 2; int index = 1; int sourceIndex = 3; int nums = 3; int count =
		 * 1; for (int i = dest; i < c2.length; i++) { c2[i] = copy[sourceIndex++];
		 * 
		 * if (count == nums) { break; } count++; }
		 */

		System.arraycopy(copy, 2, c2, 5, 1);

		for (int i = 0; i < c2.length; i++) {

			System.out.println(c2[i]);
		}
	}

}
