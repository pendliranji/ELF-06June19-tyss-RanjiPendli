package com.tyss.javaapp.collection.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {
	public static void main(String[] args) {

		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("a", 1);
		lhm.put("g", 8);
		lhm.put("h", 9);
		lhm.put("b", 3);
		
		System.out.println("---------KEY____VALUES---------");
		for (Map.Entry<String, Integer> me : lhm.entrySet()) {
			System.out.println("key :" + me.getKey() + "********" + "value :" + me.getValue());

		}
		System.out.println("---------KEYS---------");
		Set<String> set = lhm.keySet();
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("---------VALUES---------");
		Collection<Integer> coll = lhm.values();
		for (Integer in : coll) {
			System.out.println(in);
		}

	}

}
