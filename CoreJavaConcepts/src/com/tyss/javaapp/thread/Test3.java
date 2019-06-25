package com.tyss.javaapp.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test3 {

	public static void main(String[] args) {

		Mouse m1 = new Mouse("ranji");
		Mouse m2 = new Mouse("two");
		Mouse m3 = new Mouse("three");
		Mouse m4 = new Mouse("four");
		Mouse m5 = new Mouse("five");
		ExecutorService ser = Executors.newFixedThreadPool(2);
		ser.execute(m1);
		ser.execute(m2);
		ser.execute(m3);
		ser.execute(m4);
		ser.execute(m5);
		ser.shutdown();

	}

}
