package com.Java8.String1;

public class Wordcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s="  hi i am   ashok kumar ";
		 
		 char [] ch=new char[s.length()];
		 int count=0;
		 for(int i=0;i<s.length();i++){
			 ch[i]=s.charAt(i);
			 
			 if(
					 ((i==0)&&(ch[i]!=' '))
					 ||
			         ((i>0)&&(ch[i]!=' ')&&(ch[i-1])==' ')
					 ) {
				 count++;
			 }
		 }
		System.out.println(count); 
	}

}
