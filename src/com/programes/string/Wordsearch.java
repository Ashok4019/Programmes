package com.programes.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Wordsearch {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter your searching course");
		  String value=sc.next();
		  String [] input= {"ashok#kumar#java#c","virat#kohli#springboot#dotnet"};
		  wordsearch(value,input);

	}
	  public static void wordsearch(String value,String [] input){
		   Map<String,String> map=new HashMap<>();

		  boolean flag=false;
		  for(String s:input){
		   if(s.contains(value)){
		  flag=true;
		   map.put(value,s);
		}
		}
		Set<Map.Entry<String,String>> entryset=map.entrySet();
		for(Map.Entry<String,String> set:entryset){
		  String s=set.getValue();
		String [] st=s.split("#");
		for(int i=0;i<2;i++){
		System.out.println(st[i]);
		}
		}
		if(!flag){
		  System.out.println("No value");
		}

--------------------------------------------------------------------------------
	        boolean flag = false;

        for (String str : arr) {

            if (str.toLowerCase().contains(value.toLowerCase())) {

                flag = true;
                System.out.println("Search value Found: " + str);

                String[] mapArray = str.split("#");

                for (String strValue : mapArray) {
                    System.out.println(strValue);
                }

                System.out.println("----------------");
            }
        }

        if (!flag) {
            System.out.println("Search value NOT Found: " + value);
        }

        sc.close();
		  --------------------------------------------------------------------------------------

			          boolean found = Arrays.stream(arr)
                .filter(str -> str.toLowerCase().contains(value.toLowerCase()))
                .peek(str -> {
                    System.out.println("Search value Found: " + str);

                    Arrays.stream(str.split("#"))
                            .forEach(System.out::println);
                })
                .findAny()
                .isPresent();

        if (!found) {
            System.out.println("Search value NOT Found: " + value);
        }

        sc.close();

		}

}
