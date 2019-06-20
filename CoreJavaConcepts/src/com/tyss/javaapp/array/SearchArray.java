package com.tyss.javaapp.array;

import java.util.Arrays;

public class SearchArray {

	public static void main(String[] args) {

		int[] a = { 6, 5, 4, 3, 2, 1 };
		Arrays.sort(a);
		int p = Arrays.binarySearch(a, 7);
		System.out.println(p);
	}
}
