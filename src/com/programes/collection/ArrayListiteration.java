package com.programes.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArrayListiteration {

	public static void main(String[] args) {
		/*
		 * List<String> list=new ArrayList<>(); list.add("java"); list.add("php");
		 * list.add("mysql"); Iterator i = list.iterator(); while(i.hasNext()) {
		 * System.out.println(i.next()); }
		 */
		Set<String> set=new HashSet<>();
		set.add("java");
		set.add("php");
		set.add("mysql");
		 Iterator i = set.iterator();
		 while(i.hasNext()) {
			 System.out.println(i.next());
		 }

	}

}
