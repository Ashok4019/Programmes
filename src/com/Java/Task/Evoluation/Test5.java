package com.Java.Task.Evoluation;

public class Test5 {
	public static void main(String[] args) {
		
		int a=10;
		switch (10) {
		case 10: {
			
			System.out.println("10");
			break;
		}
		case 4: {
			
			System.out.println("4");
			break;
		}
		/*
		 * case 10: {
		 * 
		 * System.out.println("4"); break; }
		 */
		//duplicate case
		default:
			throw new IllegalArgumentException("Unexpected value: " + a);
		}
	}

}
