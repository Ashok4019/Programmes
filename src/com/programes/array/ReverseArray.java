package com.programes.array;

public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;

		reverse(arr, n);
	}

	public static void reverse(int arr[], int n) {

		int arr1[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr1[n - 1] = arr[i];
			n--;

		}
		for (int ar : arr1) {
			System.out.println(ar);
		}

	}

}
