package com.Java.hashcodeandequails.markerinterfaces.serilazable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee1 implements Serializable {
	private int id;
	private String name;
	private String designation;

	public Employee1(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}

}

public class MarkerInterface {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1(1, "dhoni", "coach");
		//System.out.println(e1);
		try {
		//serialization
			FileOutputStream fos = new FileOutputStream("C:/Users/ksash/User/user.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(e1);
			oos.flush();
			oos.close();
			System.out.println("object state store file succesfully ");
			
		//deserialization
			FileInputStream fis = new FileInputStream("C:/Users/ksash/User/user.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Employee1 e2=(Employee1)ois.readObject();
			//System.out.println("employee object retrived sucessfully");
		System.out.println(e2);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
