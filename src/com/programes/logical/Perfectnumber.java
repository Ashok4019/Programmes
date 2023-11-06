package com.programes.logical;

public class Perfectnumber {

	public static void main(String[] args) {
		int num=28;  //6,28
		int sum=0;
		for(int i=1;i<num;i++){
		 if(num%i==0){
		   sum=sum+i; 
		}
		}
		if(sum==num){
		 System.out.println("perfectnumber");

		}
		else{
		 System.out.println("not perfectnumber");
		}
		
			}
		  
		}