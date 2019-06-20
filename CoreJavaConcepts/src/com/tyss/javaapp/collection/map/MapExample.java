package com.tyss.javaapp.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("a", 1);
		hm.put("b", 2);
		hm.put("c", 3);

		for (Map.Entry<String, Integer> me : hm.entrySet()) {
			System.out.println("key :" + me.getKey() + "********" + "value :" + me.getValue());
		}

	}

}
