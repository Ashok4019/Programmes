package com.Java8.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Numbercount {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2 };
		List<Integer> list = Arrays.stream(arr).boxed().toList();

		Map<Integer, Long> list2 = list.stream()
				.collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting()));
		System.out.println(list2);
		
		Map<Integer, Long> collect = list.stream()
				.filter(word->Collections.frequency(list,word )>1)
		.collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting()));
		System.out.println(collect);

	}

}
