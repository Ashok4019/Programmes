package com.programes.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListExample {
	public static void main(String[] args) {

		 String [] str={"helllo", "welcome"};
		 List<String> asList = Arrays.asList(str);
		 //immutable collection
		 
		// ArrayList of string
		ArrayList<String> languageList = new ArrayList<>
		(Arrays.asList("Java", "C++", "Python", "PHP", "NodeJS"));
		languageList.add("virat");
		System.out.println(languageList);
		
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list, "Ashok","ajith","kumar");
		list.add("dhoni");
		System.out.println(list);



	}
}
