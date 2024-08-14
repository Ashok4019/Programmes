package com.Java8.String1;

public class Maxvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr []= {1,2,4,8,19,23};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			max=arr[i]>arr[max]?i:max;		
		}
		System.out.println(max);
	}

}
