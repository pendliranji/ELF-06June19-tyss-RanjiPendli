package com.tyss.javaapp.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Login {
	private static final Logger log = Logger.getLogger("amazon");

	void validateUser() {
		log.log(Level.INFO, "in Login-0-validateUser");

	}

	void navigate() {
		log.log(Level.INFO, "in Login-0-navigate");

	}

}
