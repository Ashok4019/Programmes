package com.programes.logical;

public class BinaryNumber {

	public static void main(String[] args) {
		binarynumber(12110);

	}

	public static void binarynumber(int num) {

		boolean flag = false;
		while (num > 0) {
			int rem = num % 10;
			if (rem > 1) {
				flag = true;
				break;
			} else {
				num = num / 10;
			}

		}
		if (!flag) {
			System.out.println("binary number");
		} else {
			System.out.println("not binary number");
		}

	}

}