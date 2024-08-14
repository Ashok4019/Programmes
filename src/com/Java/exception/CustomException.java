package com.Java.exception;

class MyException extends Exception {
	public MyException(String string) {
		super(string);
	}
}
public class CustomException {
	public static void main(String[] args) {

		int i = 10;
		int j = 0;
		try {
			 j=18/20;
		if (j==0) {   
			throw new MyException("I dont want print zero");
		}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
