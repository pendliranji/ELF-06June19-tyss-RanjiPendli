package com.tyss.javaapp.array.lambda;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String []args) {
		int [] b = { 1, 3, 4, 5, 6 };

		Predicate<Integer> pi = a -> a > 4;

		for (int i = 0; i < b.length; i++) {
			if (pi.test(b[i])) {
				System.out.println(b[i]);
			}

		}

	}

}
