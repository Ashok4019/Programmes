package com.programes.logical;

public class PrimeNumbers {

	public static void main(String[] args) {
		//A prime number is a number that has only two factors, 
		//that is, 1 and the number itself.
		for(int i=2;i<=100;i++){
			 
			 boolean flag=false;
			  for(int j=2;j<i;j++){
			    if(i%j==0){
			       flag=true;
			       break;
			     }
			}
			if(!flag){
			 System.out.println(i);
			}
			}	  

				}
			  
			}