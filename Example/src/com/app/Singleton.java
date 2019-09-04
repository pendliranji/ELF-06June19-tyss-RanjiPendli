package com.app;

class SuperClass implements Cloneable {
	int i = 10;

	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
}

public class Singleton extends SuperClass {
	private Singleton() {
		super();
	}

	public static Singleton s = new Singleton();

	protected Object clone() throws CloneNotSupportedException {

		return new CloneNotSupportedException();
	}

}
