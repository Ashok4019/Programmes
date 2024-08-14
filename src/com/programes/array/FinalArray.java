package com.programes.array;

public class FinalArray {

	public static void main(String[] args) {
		 
	      final int[] fin = {1, 2, 3, 4, 5};

	      for(int f:fin) {
	    	  System.out.print(f+" ");
	      }
	      System.out.println();
	  fin[0]=9;
      for(int f:fin) {
    	  System.out.print(f+" ");
      }
      // Attempting to reassign the array reference will result in a compilation error
     // fin=new int[] {7,8,9,0,9}; 
      
	}

}
