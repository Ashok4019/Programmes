package com.Java.returntype;

public class Address {

	private int id;
	private String Pincode;
	public Address(int id, String pincode) {
		super();
		this.id = id;
		Pincode = pincode;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	Address detail() {
		return new Address(1, "87808");
		
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", Pincode=" + Pincode + "]";
	}
	
}
