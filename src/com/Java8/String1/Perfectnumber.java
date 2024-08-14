package com.Java8.String1;

public class Perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=9;
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			System.out.println("perfect");
		}
		else {
			System.out.println("not perfect");
		}
	}

}
