package com.programes.logicalquestion1;

public class Test6 {

	public static void main(String[] args) {
        try 
        {
            badMethod();  
            System.out.print("A");  
        } 
        catch (RuntimeException ex) /* Line 10 */
        { 
            System.out.println("B"); 
        } 
        catch (Exception ex1) 
        { 
            System.out.println("C"); 
        } 
        finally 
        {
            System.out.println("D"); 
        } 
        System.out.println("E"); 
    } 
    public static void badMethod() 
    { 
        throw new RuntimeException(); 
    } 
}
