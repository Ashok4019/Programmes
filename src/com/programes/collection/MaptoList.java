package com.programes.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaptoList {

	public static void main(String[] args) {
	
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "java");
		map.put(2,"springboot");
		map.put(3, "hibernate");
		
		map.forEach((k,v)->System.out.println(k+" "+v));
		
		Set<Integer> keySet = map.keySet();
		Collection<String> values = map.values();
		
		ArrayList<Integer> alist=new ArrayList<>(keySet);
		ArrayList<String> alist1=new ArrayList<>(values);
		System.out.println(alist1);

	}

}
