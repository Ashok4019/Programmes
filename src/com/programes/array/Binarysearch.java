package com.programes.array;

import java.util.Arrays;

public class Binarysearch {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 4, 3, 2, 7, 8, 9 };
		//1,2,3,4,5,7,8,9
		Arrays.sort(arr);
		
		int n = arr.length - 1;
		int k = 7;
		int result = search(arr, n, k);
		if (result >= 0) {
			System.out.println(result);
		} else {
			System.out.println("not found");
		}
	}

	public static int search(int arr[], int n, int k) {

		int start = 0;
		int end = n;
		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == k) {
				return mid;
			} 
			else if (arr[mid] < k) { 
				start = mid + 1;
			} 
			else {
				end = mid - 1;
			}

		}
		return -1;
	}

}