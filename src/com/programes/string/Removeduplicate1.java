package com.programes.string;

public class Removeduplicate1 {

	public static void main(String[] args) {
		 String str="ashokkumar";
		  
		 char [] c=str.toCharArray();

		 String s="";
		 for(int i=0;i<c.length;i++){
			 boolean flag=false;
           for(int j=i+1;j<c.length;j++) {
        	   if(c[i]==c[j]) {
        		   flag=true;
        	   }
           }     
           if(!flag) {
        	   s=s+c[i];
           }
		 }
	
   System.out.println(s);
	}

}
