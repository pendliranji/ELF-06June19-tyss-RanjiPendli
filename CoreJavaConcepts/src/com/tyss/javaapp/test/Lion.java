package com.tyss.javaapp.test;

public class Lion implements Animal {

	@Override
	public void sound() {
		System.out.println("sound in lion");

	}

	@Override
	public void div(int a, int b) {
		sound();
		int c=a/b;
		System.out.println(" lion :" + c);
	}

}
