package com.programes.Oops;

class parents{

	public parents() {
System.out.println("parents");
	}
	
}
public class Test2 extends parents{
	Test2() {
		
		System.out.println("Test");
	}

	public static void main(String[] args) {
		Test2 t=new Test2();

	}

}
