package com.tyss.javaapp.array.lambda;

public class Demo {
	static int sum(int a, int b) {
		System.out.print("Sum is :");
		// System.out.print(a + b);
		return a + b;
	}

	void average(int a, int b, int c) {

		System.out.print("Average is:");
		System.out.println((a + b + c) / 3);
	}

	void fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is :" + fact);
	}
}
