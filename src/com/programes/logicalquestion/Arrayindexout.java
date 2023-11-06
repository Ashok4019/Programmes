package com.programes.logicalquestion;

public class Arrayindexout {

	public static void main(String[] args) {
		try {
		int arr []=new int[5];
		System.out.println("accesing sixth element"+arr[6]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("e exception"+ e);
		}
	
	}

}
