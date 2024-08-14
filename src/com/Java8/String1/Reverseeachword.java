package com.Java8.String1;

public class Reverseeachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String  s1="hi i am java developer";
String[] split = s1.split(" ");
int length=split.length;
 String revstring="";
  for(int i=0;i<split.length;i++) {
	  String word="";
	  word=split[i];
	  String revword="";
	 
	  for(int j=word.length()-1;j>=0;j--) {
		  revword=revword+word.charAt(j);
	  }
	  revstring=revstring+revword+" ";
  }
  System.out.println(revstring);
	}

}
