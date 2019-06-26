package com.tyss.javaapp.collections;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestThread {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Runnable runn = () -> System.out.println("run");

		Callable call = () -> 10;
		FutureTask<Integer> ft = new FutureTask<Integer>(call);

		Thread t = new Thread(runn);
		Thread t1 = new Thread(ft);
		t.start();
		t1.start();
		Integer i = ft.get();
		System.out.println(i + "---rrr");
	}
}