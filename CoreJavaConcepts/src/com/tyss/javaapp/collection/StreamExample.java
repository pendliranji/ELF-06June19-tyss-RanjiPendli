package com.tyss.javaapp.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(4);
		al.add(3);
		al.add(6);

		List<Integer> list = al.stream().filter(i -> i % 3 == 0).collect(Collectors.toList());
		System.out.println(list);

		/*
		 * LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>(); hm.put(1, 1);
		 * hm.put(2, 3); hm.put(3, 10); hm.put(4, 30);
		 */
		
		List<Integer> li=al.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(li);
		
		
		

	}

}
