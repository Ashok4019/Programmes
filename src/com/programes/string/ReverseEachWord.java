package com.programes.string;

public class ReverseEachWord {

	public static void main(String[] args) {
       String str="hi i am ashok kumar";
       String reverse="";
       String[] s = str.split(" ");
       for(int i=0;i<s.length;i++) {
    	 String word=s[i];
    	 String words="";
    	 for(int j=word.length()-1;j>=0;j--) {
    		 words=words+word.charAt(j);
    	 }
    	 reverse=reverse+words+" ";
       }
      System.out.println(reverse);
	}

}
