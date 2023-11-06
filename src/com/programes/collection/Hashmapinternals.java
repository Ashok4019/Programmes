package com.programes.collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmapinternals {

	public static void main(String[] args) {
		
		String s1="FB";
		String s2="Ea";
		System.out.println(s1.hashCode()+" "+s2.hashCode());
		
		Map<String, Integer> map=new HashMap<>();
		map.put(s1, 1);
		map.put(s2, 2);
		map.put(null, 3);
		map.put(null, 4);
		map.get(null);
		System.out.println(map.get(null));
		/*
		 * map.put("aaa", 1); map.put("bbb", 2); map.put("ccc", 3); map.put("ddd", 4);
		 * map.put("eee", 5);
		 */

	}

}
