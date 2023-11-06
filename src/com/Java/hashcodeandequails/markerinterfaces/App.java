package com.Java.hashcodeandequails.markerinterfaces;

public class App {

	public static void main(String[] args) {
		Discountutils discountutils=new Discountutils();
		boolean retunvalue=discountutils.Discounteligible(new Employee());
		//new Student();
		System.out.println(retunvalue);
	}

}
