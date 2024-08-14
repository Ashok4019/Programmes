package com.Java.DateAndTime.process;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		List<Integer> list=new LinkedList<>();
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);
		List<Integer> collect = list
		.stream()
		.sorted(Collections.reverseOrder())
		.collect(Collectors.toList());
		collect.forEach(s->System.out.print(s+" "));
	}

}
