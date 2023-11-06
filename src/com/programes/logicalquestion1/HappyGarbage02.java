package com.programes.logicalquestion1;

class Bar { } 
public class HappyGarbage02 {

    Bar doBar() 
    {
        Bar b = new Bar(); /* Line 6 */
        System.out.println(b);
        return b; /* Line 7 */
    } 
    public static void main (String args[]) 
    { 
    	HappyGarbage02 t = new HappyGarbage02();  /* Line 11 */
    	System.out.println(t);
        Bar newBar = t.doBar();  /* Line 12 */
        System.out.println("newBar"); 
        newBar = new Bar(); /* Line 14 */
        System.out.println("finishing"); /* Line 15 */
    } 
}


