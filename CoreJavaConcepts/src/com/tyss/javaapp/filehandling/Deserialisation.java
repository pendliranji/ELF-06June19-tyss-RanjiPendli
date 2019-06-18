package com.tyss.javaapp.filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Logger;

public class Deserialisation {

	private static final Logger LOG = Logger.getLogger("ranji");

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("bujji.txt");
			ois = new ObjectInputStream(fis);
			Employee e = (Employee) ois.readObject();
			LOG.info("id :" + e.getId());
			LOG.info("name :"+e.getName());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
