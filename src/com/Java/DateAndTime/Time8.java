package com.Java.DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Time8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String text = Instant.now().toString(); System.out.println(text);
		 */
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalDate date1=LocalDate.of(2024, Month.FEBRUARY, 29); //month enum
		System.out.println(date1);
		 
	}
 
	}


