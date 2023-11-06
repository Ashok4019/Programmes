package com.Java.hashcodeandequails.interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Demo {

	public static void main(String[] args) {
		Map<Employee, String> map1=new HashMap<>();
		Employee emp1=new Employee(1);
		Employee emp2=new Employee(1);
		map1.put(emp1,"john");
		map1.put(emp2,"john");
		System.out.println(map1.size());
		
		
		Map<Integer, String> map=new HashMap<>();
		Integer i=new Integer(1);
		Integer i2=new Integer(1);
		map.put(i,"kumar");
		map.put(i2, "kumar");
		System.out.println(map.size());
	}

}
class Employee{
	int id;

	public Employee(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}
	
} 