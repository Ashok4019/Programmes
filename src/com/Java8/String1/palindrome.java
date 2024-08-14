package com.Java8.String1;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int number=121;
int num=number;
    int rem=0;
while(num>0) {
	rem=rem*10+num%10; //note of it
	num=num/10;
}    
if(number==rem) {
	System.out.println("palindrome");
}
else {
	System.out.println("not palindrome");
}
	}

}
