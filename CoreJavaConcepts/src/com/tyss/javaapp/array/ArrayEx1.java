package com.tyss.javaapp.array;

import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 2, 8, 4 };
		Arrays.sort(a);
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println(a[3]);

		int first = a[0];
		int sec = a[0];
		for (int i = 1; i < a.length; i++) {

			if (a[i] > first) {
				first = a[i];
			} else if (a[i] < sec) {
				sec = a[i];
			}
		}
		System.out.println("hig :" + first);

		System.out.println("low :" + sec);

	}
}
