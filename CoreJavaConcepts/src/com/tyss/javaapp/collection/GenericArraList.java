package com.tyss.javaapp.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class GenericArraList {

	public static void main(String[] args) {

		ArrayList<Double> al = new ArrayList<>();
		al.add(9.2);
		al.add(1.5);
		al.add(6.9);
		al.add(2.4);
		al.add(3.6);
		System.out.println("Before-Sorting--" + al);
		al.add(22.34);
		al.add(al.size(),99.9);
		//Collections.sort(al);
		System.out.println("After--Sorting-" + al);
		System.out.println("---------------------------------");

		System.out.println(al);
		for (Double d : al) {
			System.out.println(d);
		}
		Iterator<Double> itr = al.iterator();
		while (itr.hasNext()) {
			Double d = itr.next();
			System.out.println(d);
		}
		ListIterator<Double> itr2 = al.listIterator(al.size());
		System.out.println("---ListIterator---");
		while (itr2.hasPrevious()) {
			Double d = itr2.previous();
			System.out.println(d);
		}

	}
}
