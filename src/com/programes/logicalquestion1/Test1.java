package com.programes.logicalquestion1;

public class Test1 {

	public static void main(String[] args) {
	    
	        int x= 0;   //1,2,3,4,5,6,8
	        int y= 0;   //1234
	        for (int z = 0; z < 7; z++)  //0123456
	        {
	            if (( ++x > 3) && (++y > 3)) 
	            {
	                x++;
	            }
	        }
	        System.out.println(x + " " + y);
	    }
	}
	