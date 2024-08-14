package com.Java8.String;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lettercount {
//frequence of string each character
	public static void main(String[] args) {

		String str = "ashokk";
		Map<String, Long> map = Arrays
		.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting()));
		System.out.println(map);
	}

}
