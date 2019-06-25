package com.tyss.javaapp.array;

public class StringExample {

	public static void main(String[] args) {
		Example e = s -> s.length();
		StringExample s1 = new StringExample();
		int len = e.returnStringLength("ranji");
		System.out.println(len);
		/*
		 * System.out.println("----------------"); FactorialExample e1 = (n) -> { for(
		 * i=1;i<=n;i++) { fact=fact*i; } return fact; };
		 * 
		 * int l=e1.fact(5);
		 */
		System.out.println("----------------");
		CharcterCount c = ll -> {
			char[] ch = ll.toCharArray();

			return ch.length;
		};
		int count = c.getCharCount("ranjith");
		System.out.println("char count :" + count);
		System.out.println("----------------");
		System.out.println("----------------");
		SquareDemo sq = mm -> (mm * mm);

		int square = sq.num(5);
		System.out.println("square :" + square);

	}

}
