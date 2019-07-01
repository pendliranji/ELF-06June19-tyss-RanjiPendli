package com.tyss.myapp.file;

import com.tyss.filecreationutil.util.CreateFileUtil;

public class TestFile {

	public static void main(String[] args) {

		CreateFileUtil cf = new CreateFileUtil();
		cf.createFile("bujji.txt", "hello ranjith");
	}

}
