package com.Java8.String1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ashokkumar";
	    char[] charArray = s.toCharArray();
	    int length=charArray.length;
	    System.out.println(length);
	    reverse(charArray,length);
		List<String> asList = Arrays.asList(s);
		String collect = asList
		.stream()
		.map(w->new StringBuilder(w).reverse())
		.collect(Collectors.joining());
		/* System.out.println(collect); */
		

	}
	 static void reverse(char [] ch,int length) {
		 if(length>0) {
			 System.out.print(ch[length-1]);
			 length--;
			 reverse(ch,length);
		 }

		 
	 }

}
