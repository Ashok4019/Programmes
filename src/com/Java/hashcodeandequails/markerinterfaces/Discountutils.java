package com.Java.hashcodeandequails.markerinterfaces;

public class Discountutils {

	public boolean  Discounteligible (Object object) {
		if(object instanceof IDiscount) {
			return true;		
		}
	return false;
		
	}
}
