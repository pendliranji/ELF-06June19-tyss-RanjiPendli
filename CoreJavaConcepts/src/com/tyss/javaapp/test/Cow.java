package com.tyss.javaapp.test;

public class Cow implements Animal {

	@Override
	public void sound() {
		System.out.println("sound in cow");
	}

	@Override
	public void div(int a, int b) {
		sound();
		int c=a+b;
		System.out.println("add :" + c);
	}

}
