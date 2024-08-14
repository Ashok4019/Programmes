package com.Java8.String1;

public class Bupplesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {12,34,9,102,45,78,90};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int a:arr) {
			System.out.print(a+",");
		}
	}

}
