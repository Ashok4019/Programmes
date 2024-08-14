package com.Java.Multithreading;

class Demo1 extends Thread  {
	public void run(){
		System.out.println("child class");
	}	
}	
public class Test2 {
	public static void main(String[] args) {
		Demo1 demo1=new Demo1();
		demo1.start();	 
	}
}
