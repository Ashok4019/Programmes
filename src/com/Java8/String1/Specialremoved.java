package com.Java8.String1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Specialremoved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String str="Ashok@#$%kumar";
		
		List<String> list = Arrays.asList(str);
		 String collect = list.stream().map(w->w.replaceAll("[^A-Za-z0-9]", ""))
		.collect(Collectors.joining());
		System.out.println(collect);
	}

}
