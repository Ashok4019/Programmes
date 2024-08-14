package com.Java8.String1;

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
 String lowerCase = str.toLowerCase();
 char[] charArray = str.toCharArray();
 String[] split = lowerCase.split("");
 List<String> asList = Arrays.asList(split);
 
 
  Map<String, Long> collect = asList
		 .stream()
		 .filter(word->Collections.frequency(asList, word)>1)
		 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
 System.out.println(collect);
 
 Map<Character,Integer> map=new HashMap<>();
 for(char c:charArray) {
	 
	 if(map.containsKey(c)) {
		 map.put(c, map.get(c)+1);
	 }
	 else {
		 map.put(c, 1);
	 }
 }
 System.out.println(map);
 Set<Entry<Character, Integer>> entrySet = map.entrySet();
 for(Entry <Character, Integer> s:entrySet) {
	 if(s.getValue()>1) {
		 System.out.println(s.getKey()+"="+s.getValue());
	 }
 }
	}
	

}
