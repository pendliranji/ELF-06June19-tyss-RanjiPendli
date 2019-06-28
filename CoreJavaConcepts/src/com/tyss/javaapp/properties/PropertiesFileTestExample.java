package com.tyss.javaapp.properties;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesFileTestExample {

	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("data.properties")) {
			Properties p = new Properties();
			p.setProperty("CompanyName", "TestYantra");
			p.setProperty("Address", "Basavanagudi");
			p.store(fos, "company Details");
			System.out.println("written");
		} catch (Exception e) {
			System.out.println("Problem");
		}
	}

}
