package com.tyss.javaapp.collection.set;

import java.util.TreeSet;

public class CarTreeSet {
	public static void main(String[] args) {

		TreeSet<Car> ts = new TreeSet<>();

		Car c = new Car();
		c.setBrand("mercedes");
		c.setCost(6);
		c.setName("benz");
		c.setRating(3.8);

		Car c1 = new Car();
		c1.setBrand("bmw");
		c1.setCost(7);
		c1.setName("bmw520");
		c1.setRating(3.8);

		Car c2 = new Car();
		c2.setBrand("Audi");
		c2.setCost(8);
		c2.setName("audiQ7");
		c2.setRating(3.8);

		ts.add(c);
		ts.add(c1);
		ts.add(c2);

		for (Car car : ts) {
			System.out.println(car.getName());
			System.out.println(car.getBrand());
			System.out.println(car.getCost());
			System.out.println(car.getRating());
			System.out.println("------------------------");
		}

	}

}
