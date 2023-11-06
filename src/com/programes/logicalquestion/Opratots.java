package com.programes.logicalquestion;

public class Opratots {

	public static void main(String[] args) {
	
		int i=1;
		int j=2;
		int k=(i++)*(++j)+i;
		System.out.println(k); //3
		System.out.println(i);  //2
		System.out.println(j);  //3
		

	}

}
