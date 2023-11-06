package com.programes.string;

public class WordCount {

	public static void main(String[] args) {
	
		String s1="hi i am ashok kumar";
		
		char [] ch=s1.toCharArray();
		
		int count=0;
	  for(int i=0;i<ch.length;i++) {
		  if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((i==0)&&(ch[i]!=' '))) {
			  count++;
		  }
	  }
		
		System.out.println(count);
	}

}
