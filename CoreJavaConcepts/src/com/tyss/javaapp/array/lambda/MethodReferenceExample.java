package com.tyss.javaapp.array.lambda;

public class MethodReferenceExample {

	static void open() {

		System.out.println("open method");
	}

	void close() {

		System.out.println("close method");
	}

	public static void main(String[] args) {

		Room r = MethodReferenceExample::open;
		r.remove();
		Room r1 = new MethodReferenceExample()::close;
		r1.remove();

	}

}
