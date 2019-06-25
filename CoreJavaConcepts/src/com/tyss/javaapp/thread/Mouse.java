package com.tyss.javaapp.thread;

public class Mouse implements Runnable {

	String name;

	public Mouse(String name) {
		this.name = name;
	}

	public void run() {

		System.out.println(name + " ------started");
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("print " + i);
		}
		System.out.println(name + " ------Completed");
	}

}
