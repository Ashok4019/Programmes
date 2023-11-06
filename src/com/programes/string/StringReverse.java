package com.programes.string;

public class StringReverse {

	static void reverse(char[] charArray,int length) {
		
		if(length>0) {
		System.out.print(charArray[length-1]);
			length--;
			reverse(charArray,length);
		}
	}
	
	public static void main(String[] args) {
	
		String s="Ashokkumar";
		char[] charArray = s.toCharArray();
		
		int length = charArray.length;
		reverse(charArray,length);

	}

}
