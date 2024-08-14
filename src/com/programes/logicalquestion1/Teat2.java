package com.programes.logicalquestion1;

public class Teat2 {

	public static void main(String[] args) {
        int x= 0;
        int y= 0;
        for (int z = 0; z < 5; z++) 
        {
            if (( ++x > 2 ) || (++y > 2)) 
            {
            	 //0 1 2  3  4 
            	 //1 2 3  5  7
            	//     4  6  8
                x++;
            }
        }
    System.out.println(x + " " + y);
    }
}
