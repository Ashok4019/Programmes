package com.programes.logicalquestion1;

public class SSBool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        if ( b1 & b2 | b2 & b3 | b2 ) /* Line 8 */
        	//false|false|false
            System.out.print("ok ");
        if ( b1 & b2 | b2 & b3 | b2 | b1 ) /*Line 10*/
        	//false|false|true
            System.out.println("dokey");
    }
}