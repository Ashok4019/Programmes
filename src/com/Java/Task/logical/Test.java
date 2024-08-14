package com.Java.Task.logical;

public class Test {

	int no=10;
	Test(){
		 no=20;
		 //we use int print 10
	}
	 public static void main(String[] args) {
		 Test t=new Test();
		 System.out.println(t.no);
		 //output 20
	}
	 
}
