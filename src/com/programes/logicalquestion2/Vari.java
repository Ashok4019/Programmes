package com.programes.logicalquestion2;

public class Vari {
	public static int a=67;
	public int b=34;
	private int c=35;
	protected int d=89;
	
	public static void main(String[] args) {
		 int e=10;
		 Vari obj=new Vari();
		 System.out.println(obj.b);
		 System.out.println(obj.c);
		 System.out.println(obj.d);
		 System.out.println(e);
		 
		System.out.println(a);
	     Vari.gc();

	}
   public  static void gc() {
	  int n=12;
	  System.out.println(n);
   }
}
