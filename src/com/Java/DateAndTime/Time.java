package com.Java.DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

	public static void main(String[] args) {
	    Date date = new Date();
	    System.out.println(date);
	    SimpleDateFormat sdf;
	    sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
	    String text = sdf.format(date);
	    System.out.println(text);

	}

}
