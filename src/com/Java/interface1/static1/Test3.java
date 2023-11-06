package com.Java.interface1.static1;
interface c{
	static void m1() {
		System.out.println("static m1 methode");
	}
}
public class Test3 implements c {

	public static void main(String[] args) {
		c.m1();
          //m1() not posible
	}

}
