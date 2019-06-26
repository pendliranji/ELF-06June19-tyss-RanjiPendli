package com.tyss.javaapp.enums;

public class EnumLoanTest {

	public static void main(String[] args) {
		Loan l1 = Loan.CAR;
		System.out.println(l1);
		System.out.println("Value is :" + l1.getValue());

		String s = "apple";
		switch (s) {
		case "applea":
			System.out.println("hello");
			break;
		default:
			System.out.println("default");
		}

		

	}
}
