package com.Java8.String1;

public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr []= {1,2,3,4,5,6,7,8,9};
 reverse(arr,arr.length);

	}
static void reverse(int [] arr,int n) {
     int arr1 []=new int [n];
     for(int i=0;i<arr.length;i++) {
    	 arr1[n-1]=arr[i];
    	 n--;
     }
   for(int a:arr1) {
	   System.out.println(a);
   }
}
}
