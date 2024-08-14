package com.Java8.Map.Flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<User> list = Stream.of(new User("Ashok", "4698765678", Arrays.asList("ksashok89@gmail.com","kumar@gmail,com")),
    		  new User("Ajith","4589766548", Arrays.asList("ashok34@gmail,com")))
      .collect(Collectors.toList());
      
      List<String> mobilno = list.stream()
    		  .map(User::getPhoneno)
    		  .collect(Collectors.toList());
      
      System.out.println(mobilno);
      
       List<List<String>> email = list.stream().map(User::getEmail).collect(Collectors.toList());
       System.out.println(email);
       System.out.println("__________________");
       //so we are using flat map
       List<String> email1 = list.stream().flatMap(u->u.getEmail().stream()).collect(Collectors.toList());
      System.out.println(email1);
	}

}
