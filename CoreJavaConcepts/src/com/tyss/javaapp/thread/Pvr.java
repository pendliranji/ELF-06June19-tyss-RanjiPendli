package com.tyss.javaapp.thread;

public class Pvr {

	void book() {
		synchronized (this) {
			for (int i = 0; i <= 5; i++) {
				System.out.println(i);

			}
		}

	}
}
