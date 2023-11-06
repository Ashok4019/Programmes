package com.Java.interface1.default1;
interface C{
	 default void m2() {
		 System.out.println("interface m2");
	 }
}
public class Test2 implements C {
	
    public static  void get() {
      Test2 test2=new Test2();
      test2.m2();
    }
	public static void main(String[] args) {
		
		new Test2().get();

	}

}
