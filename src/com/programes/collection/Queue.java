package com.programes.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Jai");
		queue.add("Rahul"); 
		queue.add(null);
		System.out.println(queue);  

	}

}
