package com.Java.interface1.logic;


public class Test1  implements Test2,Test3 {

	public static void main(String[] args) {
		
		System.out.println(Test2.value);
		System.out.println(Test3.value);
	}

}
interface Test2{
	public static int value=10;
}
interface Test3{
public static int value=20;
}