package com.programes.logicalquestion;

public class Test10 {

	static int x=1111;
	static {
		/*
		 * System.out.println(x--); System.out.println(x); //System.out.println(--x);
		 */		x=x-- - --x;
		/* int y=1111-1109; */
	}
	public static void main(String[] args) {
		System.out.println("main");
		System.out.println(x);

	}

}
