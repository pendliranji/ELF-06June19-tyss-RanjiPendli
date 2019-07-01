package com.tyss.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tyss.junit.StringOperation;

public class StringOperationTest {

	private StringOperation so = new StringOperation();

	@Test
	public void test() {

		String s = "ranhl";
		assertEquals(5, so.count(s));
	}

	@Test
	public void testA() {

		assertEquals("RANJI", so.upperCaseStrig("ranji"));

	}

}
