package com.tyss.javaapp.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {

		Vector v = new Vector();
		v.addElement(1);
		v.addElement("ranji");
		v.addElement('c');
		System.out.println(v);

		for(Object o:v) {
			System.out.println(o);
		}
		
		System.out.println("--------Iterator--Forward=====");
		Iterator itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------Iterator--Backward=====");
		ListIterator itr2 = v.listIterator(v.size());
		while (itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
		System.out.println("--------Enumeration=====");
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
	}

}
