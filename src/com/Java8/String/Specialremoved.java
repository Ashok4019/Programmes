package com.Java8.String;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Specialremoved {

	public static void main(String[] args) {
		String str="cloudte89ch#$@$";
		List<String> list=Arrays.asList(str);

		 String collect = list.stream().map(m->m.replaceAll("[^A-Za-z0-9]",""))
		.collect(Collectors.joining());
		 System.out.println(collect);

	}

}
