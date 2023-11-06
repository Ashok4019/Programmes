package com.programes.logicalquestion;
class Demo1 extends Thread{
	public void run() {
		
		System.out.println("hello");
	}
	
}

public class Multithreading6 {

	public static void main(String[] args) {
		
       Runnable r=new Demo1();
       Thread obj=new Thread(r);
       obj.start();
  
	}

}
