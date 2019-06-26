package com.tyss.javaapp.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class ArrayListExample {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(4);
		al.add(1);
		
		
		List<Integer> list=al.stream().filter(i->i%2!=0).collect(Collectors.toList());
		
		
		System.out.println(list);
		
		
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
