package com.Java.hashcodeandequails.interfaces;

public class Varcase {

	 void m1(int a,int b,int c) {
		 System.out.println("in init param m1 methode");
	 }
	 void m1 (byte... b) {
		 System.out.println("in byte var-arg param of m1 methode");
	 }
	 
	 //in this case b type is long in byte var-arg param of m1 methode
	 //value not converting large value to small data type variable
	public static void main(String[] args) {
		Varcase v1=new Varcase();
        byte b=10;
        v1.m1(b,b,b);
	}

}
