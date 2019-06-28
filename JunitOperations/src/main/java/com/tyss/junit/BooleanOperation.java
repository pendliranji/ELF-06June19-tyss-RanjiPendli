package com.tyss.junit;

import java.util.function.Predicate;

public class BooleanOperation {

	public boolean test(Integer num) {
		Predicate<Integer> p = i -> i % 2 == 0;
		return p.test(num);

	}

	public boolean divTest(int num) {
		Predicate<Integer> p = i -> i % 3 == 0;
		return p.test(num);
	}
}
