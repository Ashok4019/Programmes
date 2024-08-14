package com.Java8.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Arrayduplicate {

	public static void main(String[] args) {
	
		int arr []= {1,2,3,4,5,6,7,8,1,2};
		
		List<Integer> list = Arrays.stream(arr).boxed().toList();
		Set<Integer> set=new HashSet<>();
		
 List<Integer> collect = list.stream()
		 .distinct()
		 .collect(Collectors.toList());
 System.out.println(collect);
 
 Iterator it=collect.iterator();
while(it.hasNext()) {
	 
	 System.out.println(it.next());
 }
System.out.println("___________________________________________________");
    List<Integer> collect2 = list.stream()
    		.filter(s->set.add(s))
    		.collect(Collectors.toList());
    
    System.out.println(collect2);
    
	}

}
