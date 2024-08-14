package com.Java.returntype;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Address obj1=new Address(1, "60902"); Employee obj2=new Employee("Ashok");
		 */
		Address obj=new Address();
		Address detail = obj.detail();
		System.out.println(detail);
		Employee obj1=new Employee();
		Employee detail2 = obj1.detail();
		System.out.println(detail2);
	}

}
