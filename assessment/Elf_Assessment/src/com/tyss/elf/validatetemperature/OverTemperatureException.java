package com.tyss.elf.validatetemperature;

import lombok.extern.java.Log;
/*
 * 24)	WAP to create a custom exception to validate the temperature of the server room. (Eg: If the temperature is more that 18 degrees, there should be an exception)

 */
@Log
public class OverTemperatureException extends Exception {

	public OverTemperatureException() {
		log.info("Temperature is more than 18 celsius");

	}

}
