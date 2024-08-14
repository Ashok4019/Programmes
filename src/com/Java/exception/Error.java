package com.Java.exception;

public class Error {

	public static void main(String[] args) {
		
		System.out.println("hello"); //syntax erreor
		
		int a=10/2;
		System.out.println(a);  //10/0 it gives runtime error

		  //logic error
		 int b=2+8/2; // we give(2+8)/2
		 System.out.println("should be 5 but is value"+b );
	}

}
