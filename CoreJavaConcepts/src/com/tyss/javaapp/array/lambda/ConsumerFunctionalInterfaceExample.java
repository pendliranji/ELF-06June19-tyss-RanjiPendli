package com.tyss.javaapp.array.lambda;

import java.util.function.Consumer;

public class ConsumerFunctionalInterfaceExample {

	public static void main(String[] args) {

		Consumer<Gun> c = (g) -> {
			System.out.println("No of bullets :"+g.bullets);

		};

		c.accept(new Gun(100));

	}

}
