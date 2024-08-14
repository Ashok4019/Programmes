package com.Java.DateAndTime.process;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ashokkumarjavadeveloper";
        String lowerCase = s.toLowerCase();
		String [] str=lowerCase.split("");
		List<String> list=Arrays.asList(str);

	Map<String, Long> collect = list
	.stream()
	.filter(letter->Collections.frequency(list, letter)>1)
	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	collect.forEach((k,v)->System.out.println(k+"="+v));
	}

}
