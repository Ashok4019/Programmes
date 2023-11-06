package com.programes.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringCount {

	public static void main(String[] args) {
	 String str="java programme java nothing mysql nothing";
	 
	 Map<String,Integer> map=new HashMap();
	 String[] split = str.split(" ");
	 
	 for(String s:split) {
		 if(map.containsKey(s)) {
          map.put(s, map.get(s)+1);			 
		 }
		 else {
			 map.put(s, 1);
		 }
	 }
	 System.out.println(map);
	 Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
    for(Map.Entry<String, Integer> e:entrySet) {
    	if(e.getValue()>=2) {
    		System.out.println( e.getKey()+e.getValue());
    	}
    }
	}

}
