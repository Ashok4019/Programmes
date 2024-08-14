package com.Java.Task;

public class Array {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 5, 0, 3, 0, 2, 0 };
		int arr1[] = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr1[count] = arr[i];
				count++;
			}
		}
		for (int a : arr1) {
			System.out.println(a);
		}

	}

}
