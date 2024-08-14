package com.Java.Immutableclass;

public class App {

	public static void main(String[] args) {
		Address address = new Address("chennai", "tamilnadu");
		Employee employee = new Employee(1, "Ajith", address);
		System.out.println(employee);

		Address address1 = employee.getAddress();
		address1.setCity("Bengalore");
		address1.setCountry("karnatka");
		System.out.println(employee);

	}

}
//making all variable as final 
//remove setter
//making class as final