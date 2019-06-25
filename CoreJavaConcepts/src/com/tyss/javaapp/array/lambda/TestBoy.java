package com.tyss.javaapp.array.lambda;

public class TestBoy {

	public static void main(String[] args) {
		BoyInt b = Boy::new;
		Boy boy = b.heyBoy("ranji", 6, 23);
		System.out.println(boy);
	}
}
