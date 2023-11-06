package com.Java.hashcodeandequails.interfaces;

public class Test1 extends Demo3{

	
 int k;
 int l;
	public Test1(int i, int j,int k,int l) {
		super(i, j);
		this.k=k;
		this.l=l;
	}

	public static void main(String[] args) {
		
		Test1 test1=new Test1(1,2,3,4);
		try {
			System.out.println(" "+test1.getI()+test1.getJ()+test1.k+test1.l);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
abstract class Demo3{
	private int i;
	private int j;
	

	public Demo3(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	
}