package com.programes.Oops;

class Objactdemo{
	public Objactdemo() {
		System.out.println("constructor");
	}
	void set() {
		System.out.println("set");
	}
	
}
public class Constructor1 {

	public static void main(String[] args) {
		Objactdemo od1=new Objactdemo();
		System.out.println(od1);
		Objactdemo od2=od1;
		System.out.println(od2);
		od1.set();
		//how many times constructor get to call
	}

}
