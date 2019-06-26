package com.tyss.javaapp.thread;

public class TestOne {

	public static void main(String[] args) {

		Product p=new Product();
		Thread t=new Thread(p);
		Thread t2=new Thread(p);
		t.start();
		
		t2.start();
	}

}
