package com.tyss.javaapp.thread;

public class TestTwo {

	public static void main(String[] args) {
		Pvr p = new Pvr();
		Browser b = new Browser(p);
		b.start();

		Browser t2 = new Browser(p);
		t2.start();
		Browser t3 = new Browser(p);
		t3.start();

	}
}
