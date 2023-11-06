package com.programes.string;

public class Firstoccurence {

	public static void main(String[] args) {
		String str="ashokkumar";
		char [] c=str.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					System.out.println(c[i]);
					System.exit(i);
				}
				
			}
			
		}

	}

}
