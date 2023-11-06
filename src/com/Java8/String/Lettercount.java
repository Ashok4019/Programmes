package com.Java8.String;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lettercount {

	public static void main(String[] args) {

		String str = "ashokkumar";
		String [] st = str.split("");
		Map<String, Long> map = Arrays
		.stream(st)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
	}

}
