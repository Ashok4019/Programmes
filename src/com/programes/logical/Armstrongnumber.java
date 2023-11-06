package com.programes.logical;

public class Armstrongnumber {

	public static void main(String[] args) {
	
		int number=370;      //370,371,153
		int num=number;
		int sum=0;
		while(num>0){
		 int r=num%10;
		 sum=sum+(r*r*r);
		num=num/10;
		}
		if(number==sum){
		  System.out.println("Armstrong number");
		}
		else{
		 System.out.println("not Armstrong number");
		}
		}
		  
		}