package com.tyss.javaapp.time;

import java.time.LocalDate;
import java.time.Period;

public class DateAndTimeTest {

	public static void main(String[] args) {

		LocalDate bir = LocalDate.of(1995, 06, 12);
		LocalDate dead = bir.plusYears(70);
		Period p1=Period.between(bir, dead);
		
		System.out.println();
		
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld.getDayOfYear() + "-" + ld.getDayOfMonth() + "--" + ld.getYear() + "--"
				+ ld.getMonthValue() + "--" + ld.getDayOfWeek());
		System.out.println(ld.withDayOfYear(163));

		Period p = Period.between(ld, bir);
		System.out.println("years " + p.getYears());
		System.out.println("Months " + p.getMonths());
		System.out.println("days " + p.getDays());
		// ---------------------------------------------------------

	}

}
