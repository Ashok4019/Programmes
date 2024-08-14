package com.Java8.String2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lettercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str="ashokkumar";
		 
		 String[] split = str.split("");
		 char[] chararr= str.toCharArray();
		 
		 List<String> list = Arrays.asList(split);
		 
		 Map<String, Long> collect = Arrays
		 .stream(str.split("")) 
		 .collect(Collectors
		.groupingBy(Function.identity(),Collectors.counting()));
		 
		 collect.forEach((k,v)->System.out.println(k+"="+v));
		 System.out.println("________________________________");
		 
		 Map<String, Long> collect2 = list
		 .stream()
		 .filter(word->Collections.frequency(list, word)>1)
		 .collect
		 (Collectors.groupingBy
				 (Function.identity(),Collectors.counting()));
		 collect2.forEach((k,v)->System.out.println(k+"="+v));
		 System.out.println("______________________________");
		 Map<Character,Integer> map=new HashMap<>();
		 
		 for(char c:chararr) {
			 
			 if(map.containsKey(c)) {
				 map.put(c, map.get(c)+1);
			 }
			 else {
				 map.put(c, 1);
			 }
		 }
		 for(Entry<Character, Integer> entrySet2 : map.entrySet()) {
			 System.out.println(entrySet2.getKey()+" "+entrySet2.getValue());
		 }
		 System.out.println("_______________________________");
		 for(char keySet:map.keySet()) {
			 System.out.println(keySet);
		 }
		 System.out.println("_______________________________");
		 for(int valueSet:map.values()) {
			 System.out.println(valueSet);
		 }
		 System.out.println("_______________________________");
		 Set<Entry<Character, Integer>> entrySet = map.entrySet();
		 for(Entry<Character, Integer> s:entrySet) {
			 if(s.getValue()>1) {
				 System.out.println(s.getKey()+" "+s.getValue());
			 }
		 }
	}

}
