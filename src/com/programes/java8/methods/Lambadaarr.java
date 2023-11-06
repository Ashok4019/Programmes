package com.programes.java8.methods;

import java.util.Arrays;
import java.util.List;

public class Lambadaarr {
	public static void main(String[] args) {
	     
	       List<Integer> arr=Arrays.asList(1,2,3,4,5);
	       
	        arr.forEach(s->System.out.println(s));
	        arr.forEach(System.out::println);
	        arr.forEach(n->{
	        	   if(n%2==0){

	        	 System.out.println(n);
	        	}


	        	});
        

	}
}
