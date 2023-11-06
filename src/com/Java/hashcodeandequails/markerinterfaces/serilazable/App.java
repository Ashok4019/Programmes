package com.Java.hashcodeandequails.markerinterfaces.serilazable;
class Student implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
public class App {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student student=new Student();
		Object clone = student.clone();
		System.out.println(student);
		System.out.println(clone);

	}

}
