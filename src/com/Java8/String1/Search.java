package com.Java8.String1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="java php phython";
		String[] split = s.split(" ");
		List<String> asList = Arrays.asList(split);
		String serach="java";
		String search = search(asList,serach);
		if(search.isEmpty()) {
			System.out.println("no words found");
		}
		else {
			System.out.println(search);
		}
	}
  static String search(List<String> asList,String search) {
	  String collect = asList
	  .stream()
	  .filter(s->s.contains(search))
	  .collect(Collectors.joining());
	  
	  return collect;
  }
}
