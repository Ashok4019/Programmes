package com.programes.Oops.logical;
class A{
	A(){
		System.out.println("A");
	}
}
class B extends A{
	B(){
		System.out.println("B");
	}
}
public class C extends B{
	C(){
		System.out.println("C");
	}
public static void main(String[] args) {
	 C obj=new C();
}
}
