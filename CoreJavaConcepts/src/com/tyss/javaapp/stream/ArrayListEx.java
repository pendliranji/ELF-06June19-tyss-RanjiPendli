package com.tyss.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListEx {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(4);
		al.add(3);
		al.add(6);
		System.out.println("ascending---");
		al.stream().sorted().forEach(ref -> System.out.println(ref));
		System.out.println("descending---");
		Comparator<Integer> com = (i, j) -> j.compareTo(i);

		al.stream().sorted(com).forEach(ref -> System.out.println(ref));

		Integer ii = al.stream().max(com).get();
		Integer iii = al.stream().min(com).get();

		System.out.println("max num--" + ii);
		System.out.println("min num--" + iii);

	}

}
