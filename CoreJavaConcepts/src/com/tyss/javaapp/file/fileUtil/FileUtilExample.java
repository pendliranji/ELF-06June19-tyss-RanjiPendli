package com.tyss.javaapp.file.fileUtil;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class FileUtilExample {

	public static void main(String[] args) {
		try {
			/*
			 * FileUtils.writeStringToFile(new File("D:/sss.txt"),
			 * "This is text type data!!!", Charset.defaultCharset(),true);
			 */
			String data = FileUtils.readFileToString(new File("D:\\sss.txt"), Charset.defaultCharset());
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
