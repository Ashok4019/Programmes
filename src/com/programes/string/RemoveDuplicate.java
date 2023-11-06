package com.programes.string;

public class RemoveDuplicate {

	public static void main(String[] args) {
	
		String str="ashokkumar";
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			boolean flag=false;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					flag=true;
				}
			}
			if(!flag) {
				System.out.print(ch[i]);
			}
		}


	}

}
