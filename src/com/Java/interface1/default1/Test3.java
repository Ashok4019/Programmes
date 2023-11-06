package com.Java.interface1.default1;
interface D{

	default public  void m2() {
		System.out.println("m2 interface");
	}
}
interface F{

	default public  void m2() {
		System.out.println("m2 interface");
	}
}
class E{
	public void m2() {
		System.out.println("m2 class");
	}
}
public class Test3 extends E implements D,F {

	public static void main(String[] args) {
		Test3 t=new Test3();
		t.m2();

	}

}
