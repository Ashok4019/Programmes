package com.Java8.Functionalinterface;

@FunctionalInterface
interface A{
	/* void show(); */
	/* void show(int i); */
	int  show(int i,int j);
	 static void display() {
		 System.out.println("displaymethode");
	 };
	 default void hello() {
		 System.out.println("hellomethode");
	 };


}
public class App {

	public static void main(String[] args) {
		
		/*
		 * A obj=()->System.out.println("hello"); obj.show();
		 */

		/*
		 * A obj=i->System.out.println(i); obj.show(2);
		 */
		A obj=(i,j)->i+j;
		int result = obj.show(2, 3);
		System.out.println(result);
		A.display();
		obj.hello();
		
	}

}
