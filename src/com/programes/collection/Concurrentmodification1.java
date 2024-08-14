package com.programes.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Concurrentmodification1 {

	public static void main(String[] args) {
		List<String> list=new CopyOnWriteArrayList<>();
		list.add("Ashok");
		list.add("Ajith");
		list.add("virat");
		list.add("Ashok");
		list.add("Ajith");
		list.add("virat");
		Iterator<String> iterator = list.iterator();
		/* list.add("dhoni") */; //concurrent modification exception
		while(iterator.hasNext()) {
			
			String name = iterator.next();
			System.out.println(name);
			if(!list.contains("dhoni")) {
			list.add("dhoni");
			}
		}
		System.out.println(list);
	}

}
