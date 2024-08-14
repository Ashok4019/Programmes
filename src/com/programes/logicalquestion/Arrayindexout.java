package com.programes.logicalquestion;

public class Arrayindexout {

	public static void main(String[] args) {
		try {
		int arr []=new int[5];
		//System.exit(0); // you use the system.exit finally block
		//not excecuted
		System.out.println(arr[5]);
		System.out.println("accesing sixth element"+arr[4]);
		
		}		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			//System.out.println("e exception "+ e);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("main class");
		}
		finally {
			System.out.println("finally");
		}
	
	}

}
