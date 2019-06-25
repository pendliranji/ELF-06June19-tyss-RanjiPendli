package com.tyss.javaapp.array.lambda;

import java.util.function.Supplier;

public class SupplierFunctionalInterfaceExample2 {

	public static void main(String[] args) {

		Supplier<Car> sup = () -> new Car(150.00);

		Car car = sup.get();
		System.out.println("Car Engine cc : " + car.cc);
	}

}
