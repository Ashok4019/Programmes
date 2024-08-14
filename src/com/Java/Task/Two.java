package com.Java.Task;

import java.util.Scanner;

public class Two {

	void add() {
		One one = new One();
		System.out.println("enter first number");
		Scanner sc = new Scanner(System.in);
		one.a = sc.nextInt();
		System.out.println("enter second number");
		one.b = sc.nextInt();
	}

}
