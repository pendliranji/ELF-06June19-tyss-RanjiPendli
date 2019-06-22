package com.tyss.javaapp.collection.set;

import java.util.HashSet;
import java.util.Iterator;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class HashSetExample {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add(1);
		hs.add("aa");
		hs.add('c');
		hs.add(4.5);
		hs.add(4.5);
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
