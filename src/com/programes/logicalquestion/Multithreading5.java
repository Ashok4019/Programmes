package com.programes.logicalquestion;
class demo extends Thread{
	
	public void run(){
		for(int i=0;i<5;i++) {
		System.out.println("hello");
		}
	}
	
}


public class Multithreading5 {

	public static void main(String[] args) throws InterruptedException {
		
		demo t1=new demo();
		t1.sleep(5000);
		t1.start();

	}

}
