package com.programes.Oops.logical;
class D{
	void add() {
		System.out.println("D");
	}
}
class E extends D{
	void add() {
		//super.add(); //only this way to call  from F to D add method
		System.out.println("E");
	}
} 
public class F  extends E{
	void add() {
		super.add();
		System.out.println("F");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       F obj1=new F();
       obj1.add();
       //there is no way call to D add method from F
	}

}
