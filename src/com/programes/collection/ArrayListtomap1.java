package com.programes.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayListtomap1 {

	public static void main(String[] args) {
	
		ArrayList<Product> products=new ArrayList<>();
		products.add(new Product(1, "virat"));
		products.add(new Product(2, "dhoni"));
		products.forEach(System.out::println);
		
		Map<Integer, Product> collect = products.stream().collect(Collectors.toMap(Product::getId, product->product));
	
		 Iterator<Map.Entry<Integer, Product>> iterator = collect.entrySet().iterator();
		 while(iterator.hasNext()) {
			 Map.Entry<Integer, Product> entry = iterator.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		 }
		 }
}
class Product{
	private int id ;
	private String name;

	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
}