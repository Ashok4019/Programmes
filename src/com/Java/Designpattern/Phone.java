package com.Java.Designpattern;

public class Phone {
	public String os;
	public String battery;
	public int size;
	public String camera;
	public double length;
	public Phone(String os, String battery, int size, String camera, double length) {
		super();
		this.os = os;
		this.battery = battery;
		this.size = size;
		this.camera = camera;
		this.length = length;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", battery=" + battery + ", size=" + size + ", camera=" + camera + ", length="
				+ length + "]";
	}
	
	
}
