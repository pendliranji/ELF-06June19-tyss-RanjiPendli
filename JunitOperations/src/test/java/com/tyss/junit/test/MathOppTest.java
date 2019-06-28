package com.tyss.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tyss.junit.MathOperation;

public class MathOppTest {
	private MathOperation mo = new MathOperation();

	@Test
	public void test() {
		int actual = mo.add(5, 6);
		int expected = 11;
		assertEquals(expected, actual);
	}

	@Test
	public void testForDiv() {
		assertEquals(2, mo.div(12, 6));
	}

	@Test(expected = ArithmeticException.class)
	public void testForDivWithxception() {
		assertEquals(2, mo.div(12, 0));
	}
}
