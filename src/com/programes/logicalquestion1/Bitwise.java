package com.programes.logicalquestion1;

public class Bitwise {

	public static void main(String[] args) {
        int x = 11 & 9;                //  32 16 8 4 2 1 
        System.out.println(x);         //        1 0 1 1     
        int y = x ^ 3;                 //        1 0 0 1  
        System.out.println(y);         //        0 0 1 1
                                       //        1 0 1 0
        System.out.println( y | 12 );  //        1 1 0 0
    }
}
//1 0 1 1
//1 0 0 1
//1 0 0 1 //& both return true it is true
//0 0 1 1
//1 0 1 0 //^ both return true or false it give false
//1 1 0 0
//1 1 1 0  // | one return true its true
