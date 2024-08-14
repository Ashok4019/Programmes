package com.Java8.Map.Flatmap;

import java.util.List;

public class User {

	private String name;
	private String phoneno;
	private List<String> email;
	public User(String name, String phoneno, List<String> email) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.email = email;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public List<String> getEmail() {
		return email;
	}
	public void setEmail(List<String> email) {
		this.email = email;
	}


	
}
