package com.tyss.filecreationutil.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tyss.filecreationutil.util.CreateFileUtil;

public class FileUtilTestCase {

	private CreateFileUtil cfu = new CreateFileUtil();
	String fileName = "pendli.txt";

	@Test
	public void test() {
		boolean actual = cfu.createFile(fileName, "pendli ranjith ");
		boolean expected = true;
		assertEquals(expected, actual);
	}

}
