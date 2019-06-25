package com.tyss.javaapp.thread;

public class Product implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("from run :"+i);
		}
	}

}
