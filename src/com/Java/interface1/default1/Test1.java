package com.Java.interface1.default1;
interface B{
	void m1();
	
	default void m2() {
		System.out.println("inside a interface default methode");
	}
}
public class Test1 implements B{
      //suppose you have static methode
	public void hello() {
		B.super.m2();
	}
	
	public static void main(String[] args) {
		new Test1().hello();

	}

	@Override
	public void m1() {
	System.out.println("inside class m1");
		
	}

}
