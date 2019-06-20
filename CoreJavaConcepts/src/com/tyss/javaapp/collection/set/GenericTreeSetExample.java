package com.tyss.javaapp.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class GenericTreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> hs = new TreeSet<>();
		hs.add("bb");
		hs.add("aa");
		hs.add("cc");
		hs.add("bb");
		hs.add("zz");
		System.out.println(hs.toString());
		System.out.println("--------------");
		for (Object o : hs) {
			System.out.println(o);
		}
		System.out.println("--------------");
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("--------------");
		System.out.println("--------------");
		hs.forEach(ref -> System.out.println(ref));

	}
}
