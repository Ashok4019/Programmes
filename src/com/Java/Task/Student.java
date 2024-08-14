package com.Java.Task;

public class Student {
	int total;
	void mark() {
		 total=(55+65+67+90+56);
System.out.println(total);
	}
	void average() {
		int avg=total/5;
		System.out.println(avg);
	}
	
	public static void main(String[] args) {
		Student s=new Student();
	    s.mark();
	    s.average();

	}

}
