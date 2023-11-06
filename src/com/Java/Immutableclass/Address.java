package com.Java.Immutableclass;

public class Address {

	private String city;
	private String Country;
	
	public Address(String city, String country) {
	
		this.city = city;
		Country = country;
	}

	/*
	 * public Address(Address address) {
	 * this(address.getCity(),address.getCountry()); }
	 */
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", Country=" + Country + "]";
	}
	
	static Address getInstance(Address address){
		
		return new Address(address.getCity(),address.getCountry());
		
		
	}
}
