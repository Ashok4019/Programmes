package com.Java8.String1;

import java.util.Arrays;

public class Maxandsecmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {2,3,5,165,7,8,72,12,34,56};
		Arrays.sort(a);
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				int temp=max;
				max=a[i];
				
			}
		}
		System.out.println(max);
		System.out.println(a[a.length-2]);
	
	}

}
