package com.Java8.Optional;

import java.util.Optional;

public class Optonal {

	public static void main(String[] args) {
		
		//String str="";
		//Optional<String> optional=Optional.empty();
		String str=null;
		Optional<String> optional=Optional.ofNullable(str);
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		else {
			String value = optional.orElse("default");
			System.out.println("value is not present "+value);
		}		

	}

}
