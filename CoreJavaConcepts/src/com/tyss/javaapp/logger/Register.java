package com.tyss.javaapp.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Register {
	private static final Logger log = Logger.getLogger("amazon");

	void connect() {
		log.log(Level.INFO, "in register-0-connect");
	}

	void store() {
		log.log(Level.INFO, "in register-0-Store");
	}
}
