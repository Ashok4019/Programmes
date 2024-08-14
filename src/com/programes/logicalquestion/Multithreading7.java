package com.programes.logicalquestion;

public class Multithreading7 {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("t1 Thread" + i);
			}
		});
	
		
		Thread t2 = new Thread(() -> {
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 0; i < 10; i++) {
				System.out.println("t2 Thread" + i);
			}
		});
		
		
		
		Thread t3 = new Thread(() -> {
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 0; i < 10; i++) {
				System.out.println("t3 Thread" + i);
			}
		});

		t1.start();
		t2.start();
		t3.start();
	
		//using join methode until another thread completing excecution
	}

}
