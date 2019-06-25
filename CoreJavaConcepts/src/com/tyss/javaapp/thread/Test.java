package com.tyss.javaapp.thread;

import lombok.extern.java.Log;

@Log
public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main started");
		Pen p = new Pen();
		log.info("before start :" + p.getState());
		p.start();
		p.setName("ranji");
		p.setPriority(10);
		log.info("after start :" + p.getState());
		
		Pen p1 = new Pen();
		p1.start();
		p1.setPriority(2);
		p1.setName("ranjithpendli");
		
		Pen p2 = new Pen();
		p2.start();
		p2.setPriority(5);
		System.out.println("main ended");
	}
}
