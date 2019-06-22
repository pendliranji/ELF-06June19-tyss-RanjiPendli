package com.tyss.javaapp.array;

public class MyArrayClassTest {
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		MyArrayClass m = new MyArrayClass();
		int limit = 9;
		for (int i = 0; i < 12; i++) {
			m.addToArray("ranjiy " + i);
		}

		int pos = 28;
		if (pos < limit) {
			m.removeFromArray(pos);
		} else {
			System.out.println("size exceeds");
		}
		for (int i = 0; i < limit; i++) {
			System.out.println("Get --" + m.getfromArray(i));
		}

		long time2 = System.currentTimeMillis();
		System.out.println((time2 - time1) + "- --time");
	}

}
