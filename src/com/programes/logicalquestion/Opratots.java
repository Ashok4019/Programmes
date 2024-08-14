 package com.programes.logicalquestion;

public class Opratots {

	public static void main(String[] args) {
	
		int i=1;
		int j=2;
		int k=(i++)*(++j)+i;
		      //1*3+2
		System.out.println(k); //5
		System.out.println(i);  //2
		System.out.println(j);  //3
		

	}

}
