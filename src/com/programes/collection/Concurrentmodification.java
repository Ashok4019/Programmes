package com.programes.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Concurrentmodification {

	public static void main(String[] args) {
	 
		List<String> list=new ArrayList<>();
		list.add("Ashok");
		list.add("Ajith");
		list.add("virat");
		
		Iterator<String> iterator = list.iterator();
		/* list.add("dhoni") */; //concurrent modification exception
		while(iterator.hasNext()) {
			
			String name = iterator.next();
			System.out.println(name);
			
			list.remove("Ajith");
			
		}

	}

}
