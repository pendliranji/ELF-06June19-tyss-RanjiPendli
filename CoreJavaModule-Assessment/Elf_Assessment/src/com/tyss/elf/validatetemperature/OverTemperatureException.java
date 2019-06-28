package com.tyss.elf.validatetemperature;

import lombok.extern.java.Log;

@Log
public class OverTemperatureException extends Exception {

	public OverTemperatureException() {
		log.info("Temperature is more than 18 celsius");

	}

}
