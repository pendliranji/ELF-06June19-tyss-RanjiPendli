package com.tyss.javaapp.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		/*
		 * File f=new File("programFiles"); boolean result=f.mkdir();
		 * System.out.println("result id :"+result); File f1=new
		 * File("movies/telugu/new"); boolean folders=f1.mkdirs();
		 * System.out.println("result for folders :"+folders);
		 */

		/*
		 * try { FileInputStream fis = new FileInputStream("D:/ranji.txt"); int i;
		 * 
		 * while ((i = fis.read()) != -1) { System.out.print((char) i); } } catch
		 * (FileNotFoundException e) { // fis.close(); e.printStackTrace(); }
		 */
		// Reader
		try {
			//System.out.println("\n");
			FileReader fr = new FileReader("sari.taxt");
			BufferedReader br = new BufferedReader(fr);
			int i;
			while ((i = br.read()) != -1) {
				System.out.print(br.readLine());
				
			}

			br.close();
			fr.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

}
