package com.Java.interface1.static1;
class B{
	static void m2() {
		System.out.println("static methode");
	}
}
public class Test2 extends B {

	public static void main(String[] args) {
		m2();
//interface not possible
	}

}
