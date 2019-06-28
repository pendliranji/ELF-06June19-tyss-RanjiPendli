package com.tyss.javaapp.properties;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileReadExample {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("data.properties")) {

			Properties p = new Properties();
			p.load(fis);
			String name = p.getProperty("CompanyName");
			String addresss = p.getProperty("Address");

			System.out.println(name);
			System.out.println(addresss);

		} catch (Exception e) {

		}
	}

}
