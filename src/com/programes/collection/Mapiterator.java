package com.programes.collection;

import java.util.HashMap;
import java.util.Map;

public class Mapiterator {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "java");
		map.put(2, "springboot");
		map.put(3, "hibernate");

		map.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));

		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		for (int n : map.keySet()) {
			System.out.println(n);
		}
		for (String n : map.values()) {
			System.out.println(n);
		}
		;
		System.out.println("_________________________________");
		String string = map.get(1);
		System.out.println(string);
	}

}
