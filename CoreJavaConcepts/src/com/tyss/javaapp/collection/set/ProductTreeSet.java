package com.tyss.javaapp.collection.set;

import java.util.TreeSet;

import com.tyss.javaapp.collection.Product;

public class ProductTreeSet {

	public static void main(String[] args) {

		TreeSet<Product> ts = new TreeSet<>();
		Product p = new Product();
		p.setName("ranji");
		p.setCost(58);
		p.setRating(1);
		Product p1 = new Product();
		p1.setName("bujji");
		p1.setCost(58);
		p1.setRating(4);
		Product p2 = new Product();
		p2.setName("pendli");
		p2.setCost(58);
		p2.setRating(3.5);
		ts.add(p1);
		ts.add(p2);
		ts.add(p);

		for (Product po : ts) {
			System.out.println("Rating :" + po.getRating());
			System.out.println("Cost :" + po.getCost());
			System.out.println("Name :" + po.getName());
			System.out.println("-----------------");
		}

	}

}
