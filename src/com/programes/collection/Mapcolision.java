package com.programes.collection;

import java.util.HashMap;
import java.util.Map;

public class Mapcolision {

	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<>();
		String s1="FB";
		String s2="Ea";
		
		map.put(s1,1);
		map.put(s2,2);
		System.out.println(s1.hashCode()+" "+s2.hashCode());
	}
}
