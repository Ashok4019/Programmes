package com.programes.array;

public class Maximumvalueindex {

	public static void main(String[] args) {
		
		int array []= {11,22,44,14,25,36,};
		int maxAt = 0;

		for (int i = 0; i < array.length; i++) {
		    maxAt = array[i] > array[maxAt] ? i : maxAt;
		}
      System.out.println(maxAt);
	  }

}
