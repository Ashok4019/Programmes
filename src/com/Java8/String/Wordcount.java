package com.Java8.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Wordcount {

	public static void main(String[] args) {
		   List<String> list=new ArrayList<>();
		   Collections.addAll(list,"java","php","mysql","php");
		 System.out.println(list);
		     Map<String,Long> map=list.stream()
		 .filter(word->Collections.frequency(list,word)>1)
		 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(map);

	}

}
