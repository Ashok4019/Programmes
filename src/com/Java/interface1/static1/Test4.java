package com.Java.interface1.static1;
interface D{
	//default methode only allow for interface
	public default void m1() {
		System.out.println("static m1 methode");
	}
	public static void m2() {
		System.out.println("static m2 interface");
	}
}
public class Test4 implements D {
	public static void m2() {
		System.out.println("static m2 class");
	}
	public static void main(String[] args) {
	m2();

	}
	@Override
	public void m1() {
    System.out.println("hello ");
	}

}
