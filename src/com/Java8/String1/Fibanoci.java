package com.Java8.String1;

public class Fibanoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s1=0;
		int s2=1;
		for(int i=0;i<=10;i++) {
			int sum=s1+s2;
			s1=s2;
			s2=sum;
			System.out.println(sum);
		}
	}

}
