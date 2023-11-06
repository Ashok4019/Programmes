package com.programes.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
	    int [] arr={3,2,1,4};
	    int target=7;
	  int [] ar1=twosum(arr,target);
	 System.out.println(Arrays.toString(ar1));


	  }
	     public  static int [] twosum(int [] arr,int target){
	      
	     Map<Integer,Integer> map=new HashMap<>();
	      for(int i=0;i<arr.length;i++){
	       
	      int sum=arr[i];
	      int rem=target-sum;
	    if(map.containsKey(rem)){
	      return  new int [] {map.get(rem),i};
	  }
	  else{

	   map.put(sum,i);
	  }


	  }
	     

	    return new int [] {};
	  }
	  }
