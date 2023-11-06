package com.Java.interface1.default1;

interface A{
	void m1();
	default void m2() {
		System.out.println("inside a interface");
	}
}
public class Test implements A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new Test().m2();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		A.super.m2();
		System.out.println("Inside a class m2");
	}

	@Override
	public void m1() {
		System.out.println("inside your class m1");
		
	}

}
