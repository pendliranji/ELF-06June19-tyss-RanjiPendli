package com.tyss.javaapp.enums;

public class ExceptionCheck {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.charAt(5));
			int c = 5 / 0;
			System.out.println("success");
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("main exception");
		}
	}

}
