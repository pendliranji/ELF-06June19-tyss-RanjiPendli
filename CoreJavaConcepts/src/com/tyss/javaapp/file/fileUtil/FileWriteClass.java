package com.tyss.javaapp.file.fileUtil;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteClass {
	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("D://ranjithpendli.txt", true)) {
			String s = "ranjip";
			byte[] b = s.getBytes();
			fos.write(b);
			System.out.println("success");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
