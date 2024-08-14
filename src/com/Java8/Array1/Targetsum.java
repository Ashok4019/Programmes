package com.Java8.Array1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Targetsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {2,1,3,4};
      int target=5;
      int[] sum = sum(arr,target);
      System.out.println(Arrays.toString(sum));
 }
	static int [] sum(int arr [],int target) {
		
		Map<Integer, Integer> map=new  HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int rem=target-num;
			if(map.containsKey(rem)) {
             return new int []	{map.get(rem),i};			
			}
			else {
				map.put(num, i);
			}
		}
		return new int [] {};
		
	}
}
