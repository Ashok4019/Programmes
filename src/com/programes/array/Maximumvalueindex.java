package com.programes.array;

public class Maximumvalueindex {

	public static void main(String[] args) {
		
		int array []= {11,55,22,44,14,25,36,103};
		int maxAt = 0;

		for (int i = 0; i < array.length; i++) {
		    maxAt = array[i] > array[maxAt] ? i : maxAt;
		    //      11>11
		    //       11>55
		    //       36>103
		}
      System.out.println(maxAt);
	  }

}
