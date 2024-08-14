package com.Java.returntype;

public class Employee extends Address {
public Employee(int id, String pincode) {
		super(id, pincode);
		// TODO Auto-generated constructor stub
	}

private String name;

public Employee(int id, String pincode, String name) {
	super(id, pincode);
	this.name = name;
}
public Employee() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [name=" + name + "]";
}
Employee detail() {
	return new Employee(1, "786763", "Ajith");
	
}

}

