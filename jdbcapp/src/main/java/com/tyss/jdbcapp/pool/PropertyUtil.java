package com.tyss.jdbcapp.pool;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {

	
	Properties p = null;
	private static PropertyUtil util = null;

	public static PropertyUtil getPropertyDetails() throws IOException {
		if (util == null) {
			util = new PropertyUtil();
		}
		return util;
	}

	private PropertyUtil() throws IOException {
		p = new Properties();
		FileInputStream fis = new FileInputStream("data.properties");
		p.load(fis);
	}

	public String loadProperties(String key) {
		return p.getProperty(key);

	}

}
