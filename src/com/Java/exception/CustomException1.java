package com.Java.exception;
//class representing custom exception 
class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		 // calling the constructor of parent Exception  
		super(str);
	}
}

public class CustomException1 {
     static void validate(int Age) throws InvalidAgeException  {
    	 if(Age<18) {
    	 throw new InvalidAgeException("age is not validate to vote");
    	 }
    	 else {
    		 System.out.println("welcome to voteS");
    	 }
    	 
     }
     
	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		try {
			validate(13);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
		System.out.println(e);
		}
	}

}
