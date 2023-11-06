package com.Java8.String;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reverse {

	public static void main(String[] args) {
		/*
		 * System.out.println(reverse("Anirudh"));; } public static String
		 * reverse(String string) { return Stream.of(string) .map(word->new
		 * StringBuilder(word).reverse()) .collect(Collectors.joining(" "));
		 */
		
		String str="Ashokkumar";
		
		List<String> list = Arrays.asList(str);
		  String collect = list.stream().map(word->
		  new StringBuilder(word)
		  .reverse()).collect(Collectors.joining());
		  System.out.println(collect);
		
      }
}
