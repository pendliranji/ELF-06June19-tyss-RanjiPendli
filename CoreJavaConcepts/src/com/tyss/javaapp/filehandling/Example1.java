package com.tyss.javaapp.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Logger;

public class Example1 {
	private static final Logger LOG = Logger.getLogger("ranji");
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fis=new FileOutputStream("bujji.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fis);
		Employee e=new Employee();
		e.setId(2);
		e.setName("ranji");
		oos.writeObject(e);
		oos.close();
		LOG.info("successfully written");
		
	}

}
