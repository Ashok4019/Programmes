package com.programes.logical;

public class Primenumber {

	public static void main(String[] args) {
	    int num=15;

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
	     System.out.println("not primenumber");
	    }	  

	    	}
	      
	    }
