package com.programes.array;

public class Removeduplicate1 {

	public static void main(String[] args) {
		int arr []= {1,2,2,3,3,4,5,5,6,6,7,};
		int j=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[j]) { //2!1 3 ,2
				j++;
				arr[j]=arr[i];
			}			
		}
		for(int i=0;i<j+1;i++) {
			System.out.println(arr[i]);
		}


	}

}
