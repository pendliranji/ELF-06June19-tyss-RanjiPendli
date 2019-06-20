package com.tyss.javaapp.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class GenericVectorExample {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		
		v.add(1);
		v.add(4);
		v.add(2);
		v.add(3);
		
		
		System.out.println(v);

		for(Object o:v) {
			System.out.println(o);
		}
		
		System.out.println("--------Iterator--Forward=====");
		Iterator<Integer> itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------Iterator--Backward=====");
		ListIterator<Integer> itr2 = v.listIterator(v.size());
		while (itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
		System.out.println("--------Enumeration=====");
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		System.out.println("--------For Each with lambda=====");
		v.forEach(ref->System.out.println(ref));
		
	
	
	}
}
