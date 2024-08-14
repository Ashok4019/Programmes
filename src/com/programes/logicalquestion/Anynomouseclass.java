package com.programes.logicalquestion;

 abstract class Abc{
	 abstract void show();
}
public class Anynomouseclass {
	public static void main(String[] args) {	
		Abc obj=new Abc() {
		    void show() {
				System.out.println("hello");			
			}		
		};	
		obj.show();
	}	
}
