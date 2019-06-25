package com.tyss.javaapp.array.lambda;

import java.util.function.Consumer;

public class ConsumerEx2 {
	public static void main(String[] args) {

		Consumer<Student> c = s -> {
			System.out.println("Name :" + s.name);
			System.out.println("avg :" + (s.marks1 + s.marks2 + s.marks3) / 3);

		};

		c.accept(new Student("ranjith", 50.0, 150.0, 100.0));
	}

}
