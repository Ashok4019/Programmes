package com.programes.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Emp {
	private int id;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Emp(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	private String name;
	private int salary;

}

public class ArrayListtomap {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("java", "php", "phyton"));
		/*
		 * Iterator i = list.iterator(); while (i.hasNext()) {
		 * System.out.println(i.next()); }
		 */

		HashMap<String, Integer> arraylistconversion = arraylistconversion(list);
		for (Map.Entry<String, Integer> arr : arraylistconversion.entrySet()) {
			System.out.println(arr.getKey() + " " + arr.getValue());
		}

	}

	private static HashMap<String, Integer> arraylistconversion(List<String> arrayList) {

		HashMap<String, Integer> hashMap = new HashMap<>();

		for (String str : arrayList) {

			hashMap.put(str, str.length());
		}
		return hashMap;

	}
}
