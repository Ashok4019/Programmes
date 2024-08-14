package com.programes.logicalquestion;

public class Test4 {
	 public  static class test{
		 private int x,y;	 
	 }
	public static void main(String[] args) {
		
		// if not static class we use this keyword
		/*
		 * Test4 obj1=new Test4(); Test4.test t1=obj1.new test();
		 * System.out.println(t1.x+" "+t1.y);
		 */
		
		
		test t=new test();
		 System.out.println(t.x+t.y);
	}
}
