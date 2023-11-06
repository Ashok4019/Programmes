package com.Java.hashcodeandequails.interfaces;

public class Tset {

	public static void main(String[] args) {

Boolean b1=new Boolean("true");//true  //converting string two boolean 
//they allow two types constructor string and boolean value
boolean b2=new Boolean(true); //true
System.out.println(b1.equals(b2));

Boolean b3=new Boolean("True"); //true    //string value not case senstive
boolean b4=new Boolean("tRUE");  //true 
System.out.println(b3.equals(b4));

Boolean b5=new Boolean("hye"); //false // if string not true its treated as false 
//voice false  
boolean b6=new Boolean("bye"); //false
System.out.println(b5.equals(b6));

Boolean b7=new Boolean("hello"); //false // if string not true its treated as false 
//voice false  
boolean b8=new Boolean(false); //false
System.out.println(b7.equals(b8));
	}

}
