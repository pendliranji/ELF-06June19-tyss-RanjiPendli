package com.tyss.javaapp.stream;

public class MethodRefeenceExample {

	public static void main(String[] args) {
//Getting Pen object from Shop class,instead of creating pen object iam getting it from shop class which is already created
		Demo demo = Shop.p::write;
		demo.print(12);

		// Or use lambda directly

		Demo d = i -> System.out.println("value is:" + i);
		d.print(8);

	}
}
