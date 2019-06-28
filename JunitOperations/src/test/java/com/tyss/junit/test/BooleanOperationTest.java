package com.tyss.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tyss.junit.BooleanOperation;

public class BooleanOperationTest {

	private BooleanOperation bo = new BooleanOperation();

	@Test
	public void test() {
		assertEquals(true, bo.test(6));
	}

	@Test
	public void testA() {
		assertEquals(true, bo.divTest(6));
	}
}
