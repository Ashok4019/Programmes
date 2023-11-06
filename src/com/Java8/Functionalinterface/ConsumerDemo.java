package com.Java8.Functionalinterface;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo {

	public static void main(String[] args) {
		/*
		 * Consumer<Integer> consumer=t->System.out.println(t); consumer.accept(7);
		 */
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);
		//list.add(8); //unspported operation exception
		
	list.stream().forEach(s->System.out.println(s));

	}

}
