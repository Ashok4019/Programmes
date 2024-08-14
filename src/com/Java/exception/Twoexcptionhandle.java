package com.Java.exception;

public class Twoexcptionhandle {

	public static void main(String[] args) {
		try {
			int arr[]=new int[5];
			System.out.println(arr[5]);
			int a=4/0;
		}
		catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
		System.out.println(e);
		}
		catch (Exception e) {
			System.out.println("hello");
		}

	}

}
