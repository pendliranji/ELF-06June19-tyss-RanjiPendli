package com.tyss.javaapp.stream;

import java.util.stream.Stream;

public class StreamInterfaceArray {
	public static void main(String[] args) {

		Integer[] in = { 2, 5, 4, 8, 2, 1 };
		Object[] ob = { 1, 2.3, "ranji" };

		Stream<Integer> s = Stream.of(in);
		s.forEach(System.out::println);
		System.out.println("-------------------------");

		Stream<Object> s2 = Stream.of(ob);
		s2.forEach(i -> System.out.println(i));

		System.out.println("-------------------------");
		Stream<Object> s1 = Stream.of(8, 5, 8, 6, "ranji", 1, 5);
		s1.forEach(i -> System.out.println(i));

	}

}
