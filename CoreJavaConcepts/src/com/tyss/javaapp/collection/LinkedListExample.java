package com.tyss.javaapp.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(1);
		l.add("ma");
		l.add(91);
		l.add("maddd");
		System.out.println(l);
		for (Object o : l) {
			System.out.println(o);
		}
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
	}
}
