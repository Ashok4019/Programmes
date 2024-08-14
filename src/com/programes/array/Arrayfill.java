package com.programes.array;

import java.util.Arrays;

public class Arrayfill {

	public static void main(String[] args) {
	  int arr []= {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	  Arrays.fill(arr, 1,4,10);
	  for(int a:arr) {
	  System.out.print(a+" ");
	  }
	}

}
