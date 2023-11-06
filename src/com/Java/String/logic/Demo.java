package com.Java.String.logic;

public class Demo {

	public static void main(String[] args) {
	 String s1=new String("hi");
	 String s2=new String("hi");
	 System.out.println(s1.equals(s2));
	StringBuilder sb1=new StringBuilder("hi");
	StringBuilder sb2=new StringBuilder("hi");
	System.out.println(sb1.equals(sb2));
	System.out.println(sb1.toString().equals(sb2.toString()));

	}

}
