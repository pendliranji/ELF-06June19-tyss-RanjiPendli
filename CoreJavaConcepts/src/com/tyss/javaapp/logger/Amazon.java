package com.tyss.javaapp.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Amazon {

	private static final Logger log = Logger.getLogger("amazon");

	public static void main(String[] args) {

		LogManager.getLogManager().reset();
		log.setLevel(Level.ALL);

		try {
			FileHandler fh = new FileHandler("myamazon.log", true);
			fh.setLevel(Level.ALL);
			fh.setFormatter(new SimpleFormatter());
			log.addHandler(fh);
			log.log(Level.SEVERE, "severe inn amazon");
			Register r = new Register();
			r.connect();
			r.store();
			Login l = new Login();
			l.validateUser();
			l.navigate();
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
	}
}
