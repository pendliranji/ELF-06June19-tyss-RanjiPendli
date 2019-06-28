package com.tyss.javaapp.time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZonesTest {

	public static void main(String[] args) {

		ZoneId z=ZoneId.systemDefault();
		System.out.println(z);
		
		ZoneId z1=ZoneId.of("America/Chicago");
		
		ZonedDateTime zt=ZonedDateTime.now(z1);
		System.out.println(zt);
	
	
	System.out.println(z1.getAvailableZoneIds());
	
	}

}
