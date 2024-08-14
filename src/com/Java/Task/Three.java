package com.Java.Task;

public class Three {
	
	public static void main(String[] args) {
		Two two=new Two();
		two.add();
	    One one = new One();
		int c = one.a + one.b;
		System.out.println(c);
	}
}
