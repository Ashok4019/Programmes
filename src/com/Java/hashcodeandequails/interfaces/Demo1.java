package com.Java.hashcodeandequails.interfaces;

public  class Demo1 extends Emplo {

	 int k;
	 int l;
	public Demo1(int i, int j,int k,int l) {
		super(i, j);
		this.k=k;
		this.l=l;
	}
   public static void main(String [] args) {
	   Demo1 d1=new Demo1(2,3,4,5);
	   System.out.println(d1.i+" "+d1.j+" "+d1.k+" "+d1.l);
   }



}

 abstract class Emplo {
	 
     int i;
	 int j;
		public Emplo(int i, int j) {
			super();
			this.i = i;
			this.j = j;
		}
 }