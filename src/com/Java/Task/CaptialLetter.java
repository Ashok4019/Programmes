package com.Java.Task;

public class CaptialLetter {

	public static void main(String[] args) {
		
		String s="helloworld";
		
       String[] split = s.split("");
       for(int i=0;i<split.length;i++) {
    	   if(i%2!=0) {
    		   
    		    System.out.println( split[i].toLowerCase());
    	   }
    	   else {
    		   System.out.println(split[i].toUpperCase());  
    	   }
       }

	}

}
