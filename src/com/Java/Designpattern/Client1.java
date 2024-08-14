package com.Java.Designpattern;

public class Client1 {

	public static void main(String[] args) {
 Phone getphone = new PhoneBuilder().setOs("Android").setLength(6.5).getphone();
 System.out.println(getphone.toString());

	}

}
