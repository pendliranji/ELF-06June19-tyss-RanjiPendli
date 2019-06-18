package com.tyss.javaapp.logger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileLogger {
	private static final Logger log = Logger.getLogger("ranji");

	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		log.setLevel(Level.ALL);
		try {
			FileHandler fh = new FileHandler("ranji.log", true);
			fh.setLevel(Level.ALL);
			log.addHandler(fh);
			fh.setFormatter(new SimpleFormatter());
			log.log(Level.SEVERE, "severe");
			log.log(Level.WARNING, "warning");
			log.log(Level.WARNING, "warn");
			log.log(Level.INFO, "info");
			log.log(Level.CONFIG, "config");
			log.log(Level.FINE, "fine");
			
			System.out.println("done");
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
	}

}
