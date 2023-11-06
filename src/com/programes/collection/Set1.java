package com.programes.collection;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("Geeks");
		set.add("For");
		set.add("Geeks");
		set.add("Example");
		set.add("Set");
		set.add(null);
		System.out.println(set);

	}

}
