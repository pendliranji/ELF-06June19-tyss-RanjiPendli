package com.tyss.javaapp.array.lambda;

import java.util.function.Supplier;

public class SupplierFunctionalInterfaceExample {

	public static void main(String[] args) {
		Supplier<Gun> supplier = () -> new Gun(100);

		Gun g = supplier.get();
		System.out.println("No of bullets in a gun : " + g.bullets);

	}

}
