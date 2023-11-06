package com.programes.array;

public class Reversearraygroup {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = arr.length;
		int k = 3;
		arraygroup(arr, n, k);
		for (int re : arr) {
			System.out.println(re);
		}

	}

	public static void arraygroup(int arr[], int n, int k) {

		for (int i = 0; i < arr.length; i = i + k) {
			int start = i;
			int end = Math.min(i + k - 1, n - 1);

			while (start <= end) {
				int temp = arr[end];
				arr[end] = arr[start];
				arr[start] = temp;
				start++;
				end--;
			}

		}

	}
}