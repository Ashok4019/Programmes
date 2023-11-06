package com.programes.string;

public class Stringonly {

	public static void main(String[] args) {
		
		String st="<#a$s!h*o()k+-hajndhvchj>";
		          char[] str = st.toCharArray();
		 String st1="";
		
		 StringBuilder builder=new StringBuilder("");
		 for(int i=0;i<str.length;i++) {
			 
			 if((str[i]>=65&&str[i]<=90) ||(str[i]>=97&&str[i]<=122) ) {
				 
				 builder.append(str[i]);
			 }
		 }
System.out.println(builder);

	}

}
