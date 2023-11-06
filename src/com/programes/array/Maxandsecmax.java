package com.programes.array;

import java.util.Arrays;

public class Maxandsecmax {

	public static void main(String[] args) {
		 int arr[]={22,46,97,78,34,12,58,65};
         Arrays.sort(arr); //is important
		  int max=arr[0];
		  int secmax=0;
		  for(int i=1;i<arr.length;i++) {
			  if(max<arr[i]) {
				  secmax=max;
				  max=arr[i];
			  }
			  
		  }
		 System.out.println(secmax);
		 
		  System.out.println(arr[arr.length-2]);
		 
}

}
