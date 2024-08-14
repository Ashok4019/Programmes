package com.Java.Designpattern;

public class PhoneBuilder {
	public String os;
	public String battery;
	public int size;
	public String camera;
	public double length;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setBattery(String battery) {
		this.battery = battery;
		return this;
	}

	public PhoneBuilder setSize(int size) {
		this.size = size;
		return this;
	}

	public PhoneBuilder setCamera(String camera) {
		this.camera = camera;
		return this;
	}
	public PhoneBuilder setLength(double length) {
		this.length = length;
		return this;
	}
	public Phone getphone() {
		return new Phone(os, battery, size, camera, length);
	}
	
}
