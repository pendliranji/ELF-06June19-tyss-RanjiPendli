package com.tyss.javaapp.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class GenericLinkedListexample {

	public static void main(String[] args) {
		LinkedList<Character> ll = new LinkedList<>();
		ll.add('c');
		ll.add('d');
		ll.add('a');
		ll.add('f');
		System.out.println(ll);
		for (Character ch : ll) {
			System.out.println(ch);
		}
		System.out.println("--------Iterator--Forward=====");
		Iterator<Character> itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------Iterator--Backward=====");
		ListIterator<Character> itr2 = ll.listIterator(ll.size());
		while (itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
	}
}
