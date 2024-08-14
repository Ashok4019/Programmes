package com.Java8.Logic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



class Patient {

	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", disease=" + disease + ", amount=" + amount + "]";
	}

	private String name;
	private int age;
	private String disease;
	private int amount;

	public Patient(String name, int age, String disease, int amount) {
		super();
		this.name = name;
		this.age = age;
		this.disease = disease;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}


}
public class Coronapatient {

	public static void main(String[] args) {
		List<Patient> list=Arrays.asList(
				new Patient("Ajith",25,"Corona",25000),
				new Patient("Ashok",27,"fever",2000),
				new Patient("vijay",28,"Corona",30000),
				new Patient("virat",26,"fever",1000),
				new Patient("Rohit",22,"Corona",1000)				
				);
				
				  Double collect =
				  list
				  .stream()
				  .filter(e->e.getDisease().equalsIgnoreCase("corona"))
				  .collect(Collectors.averagingInt(e->e.getAmount()));
				  System.out.println(collect);
				 
               Double collect2 = list
               .stream()
               .filter(e->e.getDisease().equalsIgnoreCase("corona"))
               .collect(Collectors.averagingInt(Patient::getAmount));
               System.out.println(collect2);

	}

}
