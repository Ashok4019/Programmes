package com.programes.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Charcount {

	public static void main(String[] args) {
		 
		 String str="ashokkumar";
		 Map<Character,Integer> map=new HashMap<>();
		 char [] split = str.toCharArray();
		 
		 for(char s:split) {
			 if(map.containsKey(s)) {
	          map.put(s, map.get(s)+1);			 
			 }
			 else {
				 map.put(s, 1);
			 }
		 }
		 System.out.println(map);
		 Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		 
		 System.out.println("this is entry set"+entrySet);
		 //(interview question)
	    for(Map.Entry<Character, Integer> e:entrySet) {
	    	if(e.getValue()>=2) {
	    System.out.println(e);
	    	}
	    }

	}

}
