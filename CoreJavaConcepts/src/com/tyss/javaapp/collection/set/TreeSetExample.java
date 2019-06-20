package com.tyss.javaapp.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		TreeSet hs = new TreeSet();
		hs.add(1);
		hs.add(3);
		hs.add(2);
		hs.add(9);
		hs.add(8);
		System.out.println(hs.toString());
		System.out.println("--------------");
		for (Object o : hs) {
			System.out.println(o);
		}
		System.out.println("--------------");
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
