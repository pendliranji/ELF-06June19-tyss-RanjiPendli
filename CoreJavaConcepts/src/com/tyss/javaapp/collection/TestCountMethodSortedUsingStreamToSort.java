package com.tyss.javaapp.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestCountMethodSortedUsingStreamToSort {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(4);
		al.add(3);
		al.add(6);
		Comparator<Integer> comp = (i, j) -> i.compareTo(j) * -1;// for customized sorting order

		List<Integer> s = al.stream().sorted().collect(Collectors.toList());// for sorting list objects ascending order
		System.out.println("ascending---" + s);
		List<Integer> s1 = al.stream().sorted(comp).collect(Collectors.toList());// for sorting list objects for
		System.out.println("descending---" + s1);
		s1.forEach(sa -> System.out.println(sa));

		Long count = al.stream().filter(i -> i % 3 == 0).count();// count no of rows affected
		System.out.println("count :" + count);
		List<Integer> list = al.stream().filter(i -> i % 3 == 0).collect(Collectors.toList());
		System.out.println(list);

	}

}
