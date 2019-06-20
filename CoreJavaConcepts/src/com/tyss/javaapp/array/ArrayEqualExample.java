package com.tyss.javaapp.array;

import java.util.Arrays;

public class ArrayEqualExample {

	public static void main(String[] args) {

		int  [] a = { 1, 2, 3, 4, 5 };
		int  [] b = { 1, 2, 3, 4, 5 };
		/*
		 * for (int i = 0; i < a.length; i++) {
		 * 
		 * if (a[i] == b[i]) { System.out.println(a[i] + "--" + a[i] + "--" + "true");
		 * 
		 * }
		 * 
		 * }
		 */
		System.out.println("Arrays are equals--" + Arrays.equals(a, b));

	}

}
