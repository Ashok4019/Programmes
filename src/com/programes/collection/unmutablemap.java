package com.programes.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class unmutablemap {

	public static void main(String[] args) {
	   
		List<String> list=new ArrayList();
		
		list.add("a");
		list.add("b");

	List<String> unmodifiableList = Collections.unmodifiableList(list);
	unmodifiableList.add("c");//UnsupportedOperationException
	System.out.println(unmodifiableList);
	

	}

}
