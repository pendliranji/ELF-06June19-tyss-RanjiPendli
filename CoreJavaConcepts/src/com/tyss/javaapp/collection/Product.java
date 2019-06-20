package com.tyss.javaapp.collection;

import lombok.Data;

@Data
public class Product implements Comparable<Product> {
	String name;
	int cost;
	double rating;

	@Override
	public int compareTo(Product o) {
		Double d = this.rating;
		Double d1 = o.rating;

		return d1.compareTo(d);
	}
}
