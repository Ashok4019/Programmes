package com.Java8.String1;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=375;
		int number=num;
		int sum=0;
		while(num>0) {
			int r=num%10;
			System.out.println(r);
			sum=sum+(r*r*r);
			num=num/10;
		}
		if(sum==number) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("not Armstrong number");
		}
	}

}
