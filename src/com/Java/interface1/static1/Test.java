package com.Java.interface1.static1;

interface A{
	default void m1() {
		System.out.println("default methode interface");
	}
	static void m2() {
		System.out.println("static methode interface");
	}
}
public class Test {

	public static void main(String[] args) {
		//no need to implement interface to call a methode
		A.m2();

	}

}
