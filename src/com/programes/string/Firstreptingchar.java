package com.programes.string;

public class Firstreptingchar {

	public static void main(String[] args) {
	
		String s="abcdabcd";
		int firstreaptingchar = firstreaptingchar(s);
		System.out.println(firstreaptingchar);

	}
 public static int firstreaptingchar(String s) { 
	 for(int i=0;i<s.length();i++) {
		 char c=s.charAt(i);
		 if(s.indexOf(c)==s.lastIndexOf(c)) {
			 return i;
		 }
	 }
	return -1;
	 
 }
}
