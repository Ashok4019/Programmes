package com.programes.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {

	public static void main(String[] args) {
	    int arr[]={1,2,3,7,6,5,8,9};
	    int target=5;
	   int ar []=twosum(arr,5);
	   System.out.println(Arrays.toString(ar));

	   }
	   static int [] twosum(int arr [],int target){
		   Map<Integer,Integer> map=new HashMap<>();
		   for(int i=0;i<arr.length;i++){
	  
	     int sum=arr[i];
	     int rem=target;

	   if(map.containsKey(rem)){
	    return new int []{map.get(rem),i};
	   }
	   else{
	    map.put(sum,i);
	   }
	   }

	    return new int [] {};
	   }
	   }