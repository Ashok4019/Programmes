package com.programes.logicalquestion;

public class Test8 {
	static void run(String o) {
		System.out.println("string");
	}
	static void run(Object o) {
		System.out.println("Object");
	}
	public static void main(String[] args) {
		run(null);
	}
}
