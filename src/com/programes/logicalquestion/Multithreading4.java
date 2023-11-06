package com.programes.logicalquestion;

public class Multithreading4 extends Thread {
	   public void run() 
	   { 
	       System.out.println("Thread name: " + Thread.currentThread().getName()); 
	       System.out.println("Check if its DaemonThread: "  
	                       + Thread.currentThread().isDaemon()); 
	   } 
	public static void main(String[] args) {
		Multithreading4 t1 = new Multithreading4(); 
		Multithreading4 t2 = new Multithreading4(); 
	       t1.start();         
	       // Exception as the thread is already started 
	       t1.setDaemon(true); 
	       t2.start();
	       
	      // thread name  start from 0
	       //after start methode we not setdemon it throw error

	}

}
