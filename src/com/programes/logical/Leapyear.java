package com.programes.logical;

public class Leapyear {

	public static void main(String[] args) {
		
		int value=2020;
		
		if((value%4==0)&&(value%100!=0)||value%400==0) {
			
			System.out.println("leap year");
		}
		else {
			System.out.println("not leap year");
		}

	}

}
