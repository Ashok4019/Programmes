package com.programes.Oops;

import java.io.FileNotFoundException;

class parent{

	public parent() throws FileNotFoundException {
   System.out.println("parent");
	}

}
public class Test extends parent{
	Test() throws FileNotFoundException{
		
		System.out.println("Test");
	}

	public static void main(String[] args) throws FileNotFoundException {
		Test t=new Test();

	}

}
