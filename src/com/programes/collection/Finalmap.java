package com.programes.collection;

import java.util.ArrayList;
import java.util.List;

public class Finalmap {

	public static void main(String[] args) {
	
		final List<String> list=new ArrayList();
		
		list.add("a");
		list.add("b");
		System.out.println(list);
		 list.set(1, "E");
			//System.out.println(list);
			//list=new ArrayList();
			list.add("c");
			list.add("d");
			System.out.println(list);
			
	}

}
