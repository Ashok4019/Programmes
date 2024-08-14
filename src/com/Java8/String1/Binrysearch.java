package com.Java8.String1;

import java.util.Arrays;

public class Binrysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] a= {1,4,2,5,6,7,8,9};
       //1,2,4,5,6,7,8,9
       Arrays.sort(a);
       int n=a.length;
       int k=7;
       int search = search(a,n,k);
       if(search>=0) {
    	   System.out.println(search);
       }
       else {
    	   System.out.println("value not present");
       }
	}
 static int search(int arr[] ,int n,int k) {
	 int start=0;
	 int end=n;
	 while(start<=end) {
		 int mid=(start+end)/2;
		 if(arr[mid]==k) {
			 return mid;
		 }
		 else if(arr[mid]<k) {
			 start=mid+1;
		 }
		 else {
			 end=mid-1;
		 }
	 }
	return -1;
	 
 }
}
