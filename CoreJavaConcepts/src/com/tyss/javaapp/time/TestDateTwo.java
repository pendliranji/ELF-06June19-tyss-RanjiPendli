package com.tyss.javaapp.time;

import java.time.LocalDateTime;

public class TestDateTwo {
	public static void main(String[] args) {

		LocalDateTime ld = LocalDateTime.now();
		System.out.println(ld);
		//System.out.println(ld.getDayOfMonth()+"--"+ld.getHour()+"--"+ld.getMinute()+"--"+ld.getNano()+"--"+ld.getSecond());
		//System.out.println(ld.toLocalDate()+"--"+ld.toLocalTime());
		System.out.println(ld.withDayOfMonth(12));
		LocalDateTime ldt = LocalDateTime.of(1995, 06, 12, 12, 30);
		System.out.println("DOB  :"+ldt.toLocalTime()+" "+ldt.toLocalDate());
		System.out.println(ldt);

		//Period.between(ld, ldt);
		
		LocalDateTime lt = ld.minusYears(1995);
		System.out.println("AGE :"+lt.getYear()+" ");
	}

}
