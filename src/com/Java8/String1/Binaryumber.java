package com.Java8.String1;

public class Binaryumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num=1211;
  boolean flag=false;
  while(num>0) {
	  int rem=num%10;
	  if(rem>1) {
		  flag=true;
		  break;
	  }
	  else {
		num=num/10;  
	  }

  }
  if(!flag) {
	  System.out.println("binary");
  }
  else {
	  System.out.println("not binary");
  }
	}

}
