package com.programes.logicalquestion;

public class Test10 {

	static int x=1111;
	static {
		x=x-- - --x;
	}
	public static void main(String[] args) {
		System.out.println(x);

	}

}
