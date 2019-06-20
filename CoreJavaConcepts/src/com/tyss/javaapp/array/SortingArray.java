package com.tyss.javaapp.array;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray {

	public static void main(String[] args) {

	Integer[] a = { 1, 4, 5, 2, 7 };
		int x = 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				System.out.println(a[i] + "---exists");
			}
		}
		//Sorting--
		Arrays.sort(a);
		System.out.println("--------------------------------"+"Ascending order");
		System.out.println("Integer type sorting");
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}
		System.out.println("--------------------------------"+"Descending order");
		//reverse  sortibg--
		Arrays.sort(a,Collections.reverseOrder());
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}
		System.out.println("--------------------------------");
		System.out.println("Double type sorting");

		double[] c = { 2.4, 6.9, 3.2, 4.6 };
		Arrays.sort(c);
		for (int j = 0; j < c.length; j++) {

			System.out.println(c[j]);

		}

	}

}
