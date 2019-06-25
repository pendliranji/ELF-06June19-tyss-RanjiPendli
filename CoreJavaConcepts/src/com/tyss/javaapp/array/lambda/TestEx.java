package com.tyss.javaapp.array.lambda;

public class TestEx {

	public static void main(String[] args) {

		StrinInterface si = s -> s.length() == 5;

		boolean b = si.len("ranni");
		System.out.println(b);
	}

}
