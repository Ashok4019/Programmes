package com.programes.java8.methods;

 interface Functional {
	void add(int a, int b);
}

public class Lambda {
	public static void main(String[] args) {

		Functional obj = (a, b) -> System.out.println(a + b);
		obj.add(2, 3);

	}
}
