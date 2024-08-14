package com.Java8.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) {
		int arr []={1,2,3,4,5,6,7,8,9,1,2};
		 List<Integer> list=Arrays.stream(arr).boxed().toList();
		  
		  List<Integer> list1=list.stream().distinct()
				  .sorted().collect(Collectors.toList());
		System.out.println(list1);
		System.out.println("_____________________________________");
		  List<Integer> list2=list.stream().distinct()
				  .sorted(Collections.reverseOrder())
				  .collect(Collectors.toList());
		  System.out.println(list2);

	}

}
