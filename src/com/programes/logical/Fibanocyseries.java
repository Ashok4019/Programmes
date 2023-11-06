package com.programes.logical;

public class Fibanocyseries {

	public static void main(String[] args) {
		
		int s1=0;
		int s2=1;
		for(int i=2;i<=10;i++){

		int sum=s1+s2;
		System.out.println(sum);
		s1=s2;
		s2=sum;
		}
		}
		  
		}