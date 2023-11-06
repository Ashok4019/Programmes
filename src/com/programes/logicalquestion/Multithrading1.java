package com.programes.logicalquestion;

public class Multithrading1 {

	public static void main(String[] args) throws InterruptedException {
	Thread t1=new Thread();
	t1.start();
	System.out.println("welcome");
	t1.wait(1000);
	System.out.println("hi");

	}

}
