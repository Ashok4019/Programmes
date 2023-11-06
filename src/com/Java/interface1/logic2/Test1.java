package com.Java.interface1.logic2;

interface A{
	 void m2();
}
interface B{
	 void m2();
	
}
interface c{
	 void m2();
	
}
public class Test1 implements A,B,c{

	public static void main(String[] args) {
	new Test1().m2();

	}

	@Override
	public void m2() {
		System.out.println("inside the main class");
		
	}

}
