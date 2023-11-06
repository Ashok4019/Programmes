package com.Java8.String;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Specialremoved {

	public static void main(String[] args) {
		String str="cloudtech#$@$";
		List<String> list=Arrays.asList(str);

		 list.stream().map(m->m.replaceAll("[^A-Za-z0-9]",""))
		.collect(Collectors.toList()).forEach(System.out::println);

	}

}
