package com.programes.logicalquestion;

public class Test3 {

	public static void main(String[] args) {
		
		Integer num1=100;
		Integer num2=100;
		Integer num3=500;
		Integer num4=500;
		
		//not int its integre consider as a class
		//-128 to +127 they consider same memory
		
		if(num1==num2) {
			System.out.println("num1==num2");
			
		}
		else {
			System.out.println("num1!=num2");
		}
		if(num3==num4) {
			System.out.println("num3==num4");
			
		}
		else {
			System.out.println("num3!=num4");
		}


	}

}
