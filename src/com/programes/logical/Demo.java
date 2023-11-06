package com.programes.logical;

public class Demo {
	public static void main(String[] args) {
 
		int n=9;
		String binaryString = Integer.toBinaryString(n);
		System.out.println(binaryString);
			
		String m="1011";
		int parseInt = Integer.parseInt(binaryString,2);
		System.out.println(parseInt);
	}
 
	}
