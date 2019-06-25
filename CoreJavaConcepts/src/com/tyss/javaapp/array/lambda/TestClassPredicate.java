package com.tyss.javaapp.array.lambda;

import java.util.function.Predicate;

public class TestClassPredicate {
	public static void main(String[] args) {
		Predicate<Integer> p = a-> a%2 == 0;
		
		boolean b=p.test(16);
		System.out.println(b);
	}

}
