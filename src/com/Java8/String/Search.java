package com.Java8.String;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Search {

	public static void main(String[] args) {
		
		String [] str=new  String[] {"java","php","mysql"};
		List<String> list = Arrays.asList(str);
		String search="java";
		
		String result=finduingstream(search,list);
		if(!result.isEmpty())
		System.out.println(result);
		else
			System.out.println("not found");
     
	}
 public static String finduingstream(String serach,List<String> list){
	 
	String matchingelements = list.stream().filter(s->s.contains(serach))
			.collect(Collectors.joining());
	return matchingelements;
	 
	 
 }
}
