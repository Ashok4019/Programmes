package com.Java8.Array1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Arrayduplicate {

	public static void main(String[] args) {

		int arr[]= {1,4,13,2,5,16,1,2,3};
		
		List<Integer> list = Arrays
				.stream(arr)
				.boxed()
				.collect(Collectors.toList());
		
		Map<Integer, Long> collect3 = list
		.stream()
		.filter(word->Collections.frequency(list, word)>1)
		.collect(Collectors.groupingBy
				(Function.identity(),Collectors.counting()));
	System.out.println(collect3);

		List<Integer> collect = list
				.stream()
				.distinct()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(collect);
		 Integer reduce = list.stream().reduce(0,Integer::sum);
		 System.out.println(reduce);
		 List<String> collect2 = list
				 .stream().map(m->m+"")
				 .filter(s->s.startsWith("1"))
				 .collect(Collectors.toList());
		 System.out.println(collect2);
	}

}
