package com.Java.Multithreading;
class Demo extends Thread{
	@Override
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("thread start"+i);
		}
		super.run();
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		Demo demo=new Demo();
		System.out.println("thread start");
		demo.start();
		System.out.println("thread end");

	}

}
