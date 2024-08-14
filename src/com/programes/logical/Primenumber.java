package com.programes.logical;

public class Primenumber {

	public static void main(String[] args) {
		
		  int num=11;
		  
		  if(num>1){ 
			  int count=0; 
			  for(int i=1;i<=num;i++){ 
				  if(num%i==0){ 
					  count++; 
					  } 
				  }
		  if(count==2){
		  
		  System.out.println("primenumber"); 
		  }
		  else {
			  System.out.println("not primenumber");
			  }
		  }
		 
		/*
		 * int n=0; for(int i=2;i<=100;i++) {
		 *  boolean flag=false; 
		 *  for(int j=2;j<i;j++) {
		 * if(i%j==0) {
		 *  flag=true;
		 * 
		 * } 
		 * } 
		 * if(!flag &&n<10) 
		 * { 
		 * n++; System.out.println(i); 
		 * } }
		 */
	}

}
