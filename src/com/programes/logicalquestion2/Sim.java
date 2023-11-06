package com.programes.logicalquestion2;

public class Sim implements Vodafone {

	public static void main(String[] args) {
	Sim s=new Sim();
		get1(); 
		s.calling();
		s.network();

	}
public static final void get1() {
	System.out.println("hello");
}

@Override
public void calling() {
	System.out.println("calling methode");
	
}
@Override
public void network() {
	System.out.println("network methode");
	
}
}
