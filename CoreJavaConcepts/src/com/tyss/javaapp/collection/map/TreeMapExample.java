package com.tyss.javaapp.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) throws ClassNotFoundException {
		TreeMap<Character, Integer> tm = new TreeMap<>();
		tm.put('c', 2);
		tm.put('t', 10);
		tm.put('b', 6);
		tm.put('h', 5);

		for (Map.Entry<Character, Integer> me : tm.entrySet()) {
			System.out.println("key :" + me.getKey() + "********" + "value :" + me.getValue());
		}

	}

}
