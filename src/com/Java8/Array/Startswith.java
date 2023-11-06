package com.Java8.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Startswith {

	public static void main(String[] args) {
		 
	     List<Integer> list=new ArrayList<>();
	Collections.addAll(list,12,3,15,18,9,4,3);
	System.out.println(list);
	List<String> collect = list.stream().map(m->m+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
	 
	List<String> list2=list.stream().map(m->m+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
 System.out.println(collect);
	}

}
