package com.tyss.javaapp.stringex;

public class StringExample {
	public static void main(String[] args) {

		String s = "ranjith pendli";

		String[] arr = s.split("\\s");
		String rev = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			rev = rev + " " + arr[i];
		}
		System.out.println(rev);
	}

}
