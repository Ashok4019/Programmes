package com.programes.logicalquestion1;

public class Test5 {

	public static void main(String[] args) {
        try 
        {
            badMethod();  
            System.out.print("A"); 
        }  
        catch (Exception ex) 
        {
            System.out.print("B");  
        } 
        finally 
        {
            System.out.print("C"); 
        } 
        System.out.print("D"); 
    }  
    public static void badMethod() 
    {
        throw new Error(); /* Line 22 */
    } 
}
