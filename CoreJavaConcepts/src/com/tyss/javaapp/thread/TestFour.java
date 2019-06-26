package com.tyss.javaapp.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestFour {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Pencil p = new Pencil();
		FutureTask<Integer> ft = new FutureTask<Integer>(p);
		Thread t = new Thread(ft);
		t.start();
		int i = ft.get();
		System.out.println(i);
	}

}
