package com.Java.Task;

class MyExcpetion extends Exception{

	public MyExcpetion(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}
	
}
public class Custom {
 int a;
	
	public Custom(int a) throws MyExcpetion  {
	
	if(a%2==0) {
		throw new MyExcpetion("Even number exception");
	}
	else {
		throw new MyExcpetion("add number exception");
	}
	
}

	public static void main(String[] args) {
		try {
			Custom custom=new Custom(10);
		} catch (MyExcpetion e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}

}
