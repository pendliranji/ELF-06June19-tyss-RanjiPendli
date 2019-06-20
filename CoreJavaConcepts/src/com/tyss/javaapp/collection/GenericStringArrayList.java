package com.tyss.javaapp.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class GenericStringArrayList {

	public static void main(String[] args) {
		ArrayList<String> bl = new ArrayList<>();
		bl.add("aaa");
		bl.add("ppp");
		bl.add("sss");
		
		ArrayList<String> al = new ArrayList<>();
		al.add("ranji");
		al.add("pendli");
		al.add("sari");
		System.out.println("Before sorting----" + al);
		al.add(1, "mom");// add(index,value) will set in particular index and moves the previous value to
							// next index...
		String type = al.set(3, "dad");// set method removes and replaces current value with present value
		System.out.println("setb & removed:" + type);
		System.out.println("remove---" + al.remove(3));
		
		al.addAll(bl);
		
		//Collections.sort(al);
		System.out.println("After sorting----" + al);
		for (String s : al) {
			System.out.println(s);
		}
		System.out.println("--------------Iterator0-");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
		System.out.println("------------List--Iterator0-");
		ListIterator<String> itr2 = al.listIterator(al.size());
		while (itr2.hasPrevious()) {
			String s = itr2.previous();
			System.out.println(s);
		}

	}
}
