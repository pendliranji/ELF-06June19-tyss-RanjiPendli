package com.tyss.javaapp.enums;

public enum Loan {

	HOME(240), PERSONAL(241), CAR(242);
	private int value;

	private Loan(int value) {
		this.value = value;
	}

	int getValue() {
		return value;
	}

}

