package com.programes.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Targetsum {

	//private static int[] sum;

	public static void main(String[] args) {
		int[] arr1 = { 3, 5, 6, 2 };
		int target = 7;
		int[] sum2 = sum(arr1,target);
     System.out.println(Arrays.toString(sum2));
	
	}
	
	public  static int[] sum(int arr[],int target) {
		
		Map<Integer,Integer> map=new HashMap<>();

		for(int i=0;i<arr.length;i++) {
			
			int num=arr[i];   //2
			int rem=target-num;    //5=7-2
			if(map.containsKey(rem)) {                 
				return new int [] {map.get(rem),i};
			}
			else {
				map.put(num, i);        // 5,2,1
			}
		}
		return new int [] {};
		
		
	}
 
}
