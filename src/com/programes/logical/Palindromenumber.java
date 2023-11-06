package com.programes.logical;

public class Palindromenumber {

	public static void main(String[] args) {
		
		int number=121;    
		int num=number;
		int rem=0;
		while(num>0){
		  rem=rem*10+num%10;
		num=num/10;
		}
		if(number==rem){
		  System.out.println("palindrome number");
		}
		else{
		 System.out.println("not palindrome number");
		}
		}
		  
		}