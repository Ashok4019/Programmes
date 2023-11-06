package com.programes.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Removeduplicate {

	public static void main(String[] args) {
		   int arr[]= {1,2,2,3,3,4,4,5,5,6,6,7,};
		   Arrays.sort(arr);

		     int j=0;
		   for(int i=0;i<arr.length-1;i++){
		     
		   if(arr[i]!=arr[i+1]){
              
		      arr[j]=arr[i];
		      j++;
		   }
		    
		   }
		     arr[j]=arr[arr.length-1];
		   for(int i=0;i<=j;i++){
		    System.out.println(arr[i]);
		   }
		   System.out.println("_____________________________________");
		   
		   List<Integer> list = Arrays.stream(arr).boxed().toList();
		   List<Integer> list2 = list.stream().distinct().toList();
		   System.out.println(list2);
  
		   
		   }
		    
		   }
