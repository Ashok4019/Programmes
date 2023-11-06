package com.programes.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class User{
	String Case1;
	String Case2;

	public User(String case1, String case2) {
		super();
		Case1 = case1;
		Case2 = case2;
	}
	@Override
	public String toString() {
		return  Case1 + " " + Case2 ;
	}
	
}
public class Hashmapinter {

	public static void main(String[] args) {
	
		Map<String,User> map=new HashMap<>();
		User u1=new User("caseno101", "caseNo110");
		User u2=new User("caseNo201", "caseNo210");
		map.put("Renuka", u1);
	
		map.put("Vishnu", u2);
		map.get("Renuka");
		//System.out.println(map.get("Renuka"));
        
		map.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));

	
		
		
	}

}
