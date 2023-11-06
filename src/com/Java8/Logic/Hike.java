package com.Java8.Logic;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;





class Employe {

	private String name;
	private String dept;
	private int age;
	private double salary;
	
	@Override
	public String toString() {
		return "Employe [name=" + name + ", dept=" + dept + ", age=" + age + ", salary=" + salary + "]";
	}

	public Employe() {

	}

	public Employe(String name, String dept, int age, double salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	


}
public class Hike {

	public static void main(String[] args) {
		List<Employe> employe=Arrays.asList(
                new Employe ("Ajith","IT",27,1000),
                new Employe ("Ashok","IT",26,2000),
                new Employe ("Vijay","IT",23,35000),
                new Employe ("virat","hr",27,3500),
                new Employe ("Rohit","hr",26,4000),
                new Employe ("Dhoni","hr",23,2000)
                
                );
		//get hike
		List<Employe> hike = employe.stream().map(e->{
			if(e.getDept().equalsIgnoreCase("IT")&&e.getAge()>26) {
				e.setSalary(e.getSalary()*1.1);
			}
			return e;
		}).collect(Collectors.toList());
		System.out.println(hike);
		//get min
		Employe min = employe.stream().filter(e->e.getDept().equalsIgnoreCase("hr"))
			.min(Comparator.comparing(Employe::getSalary)).get();
		System.out.println(min);
		
		//get max
		Employe max = employe.stream().filter(e->e.getDept().equalsIgnoreCase("it"))
		.max(Comparator.comparing(Employe::getSalary)).get();
		System.out.println(max);
		
		//get max each department
		Map<String, Employe> maxeach = employe
		.stream()
		.collect(Collectors.groupingBy(e->e.getDept(),Collectors
		.collectingAndThen(Collectors
	    .maxBy(Comparator.comparing(e->e.getSalary())), Optional::get)));
		System.out.println(maxeach);
		

	}


}
