package com.tyss.javaapp.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList al = new ArrayList<>();
		al.add("abc");
		al.add('d');
		al.add(1);
		System.out.println("-------------------------");
		for (Object o : al) {
			System.out.println(o);
		}
		System.out.println("-------------------------");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("-------------------------");

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Object o = itr.next();
			System.out.println(o);

		}
		System.out.println("----------FORWARD---------------");
		ListIterator itr1 = al.listIterator();
		while (itr1.hasNext()) {
			Object o = itr1.next();
			System.out.println(o);
		}
		System.out.println("----------BACKWARD---------------");
		ListIterator itr2 = al.listIterator(al.size());
		while (itr2.hasPrevious()) {
			Object o = itr2.previous();
			System.out.println(o);
		}
		
	
	}

}
