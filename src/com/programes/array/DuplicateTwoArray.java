package com.programes.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,6,7};
		int arr2[]= {6,7,8,9,10};

  Set<Integer> set=new HashSet<>();

    for(int i=0;i<arr.length;i++){
   set.add(arr[i]);
}
    for(int j=0;j<arr2.length;j++){
     if(set.contains(arr2[j])){
    	  //System.out.print(arr2[j]+" ");
}
else{
 set.add(arr2[j]);
}
}
Iterator i=set.iterator();
while(i.hasNext()){
  System.out.println(i.next());
}
}
 
}
