package com.programes.multithreading;

public class Deadlock {

	public static void main(String[] args) {
		
		String s1="ashok";
		String s2="ajith";
		
		Thread t1=new Thread() {
			
			public void run() {
				
				synchronized (s1) {
					System.out.println("thread 1 locked 1");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (s2) {
						System.out.println("thread 1 locked 2");
					};
				}
			}
			
		};
		Thread t2=new Thread() {
			
			public void run() {
				
				synchronized (s1) {
					System.out.println("thread 1 locked 1");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (s2) {
						System.out.println("thread 1 locked 2");
					};
				}
			}
			
		};
		t1.start();
		t2.start();

	}

}
