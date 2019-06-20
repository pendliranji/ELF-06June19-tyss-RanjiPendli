package com.tyss.javaapp.collection.set;

import lombok.Data;

@Data
public class Car implements Comparable<Car> {

	String name;
	String brand;
	int cost;
	double rating;

	@Override
	public int compareTo(Car o) {

		return name.compareTo(o.name);
	}
}
