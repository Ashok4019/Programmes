package com.Java8.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sum {

	public static void main(String[] args) {
	     List<Integer> list=new ArrayList<>();
	     Collections.addAll(list,1,2,3,4);

	      int sum=list.stream().reduce(0,Integer::sum);
	     System.out.println(sum);
	     System.out.println("__________________________________");
	     list.stream().map(m->m+sum).forEach(System.out::println);

	}

}
