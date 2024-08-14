package com.Java.String.logic;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Ashok kumar";
String[] split = s1.split(" ");
char[] charArray = s1.toCharArray();
for(int i=split.length-1;i>=0;i--) {
	System.out.print(split[i]);
}
	}

}
