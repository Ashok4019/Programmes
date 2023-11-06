package com.programes.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Employee{
	int id;


	public Employee(int id) {
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

public class Hascodeequalscontract {

	public static void main(String[] args) {
	
		 Employee e=new Employee(1);
		 Employee e1=new Employee(1);
		 Map<Employee,String> map=new HashMap<>();
	      map.put(e, "Ashok");
	      map.put(e1, "Ashok");
	      System.out.println(map.size());
	      
		 Map<Integer,String> map1=new HashMap<>();
	     Integer i=new Integer(1);
	     Integer i1=new Integer(1);
	    map1.put(i, "one");
	    map1.put(i1, "one");
	     System.out.println(map1.size());
		 
		 

	}

}
