package com.Java8.String1;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int n=12; int m=n/2; boolean flag=false; if(n==0 || n==1) {
		 * System.out.println("not prime number"); } else { for(int i=2;i<m;i++) {
		 * if(n%i==0) { flag=true; System.out.println("not prime number"); break; } } }
		 * if(!flag) { System.out.println("prime number"); }
		 */
       

		int n=0;
		for(int i=2;i<100;i++) {
			boolean flag=false;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=true;
				}
			}
			if(!flag && n<10) {
				System.out.println(i);
				n++; 
			}
		}
       
	}

}
