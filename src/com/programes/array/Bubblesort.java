package com.programes.array;

public class Bubblesort {

	public static void main(String[] args) {
		
		 int arr[]={22,46,78,34,12,58};
		 int n=arr.length;
		sort(arr,n);
		for(int a:arr){
		System.out.println(a);
		}

		}
		public static void sort(int arr[],int n){

		 for(int i=0;i<arr.length-1;i++){ 
		   for(int j=0;j<arr.length-1-i;j++){  // -1 is imporatant
		   if(arr[j]>arr[j+1]){
		       int temp=arr[j];
		       arr[j]=arr[j+1];
		       arr[j+1]=temp;  
		}
		}

		}


		}
		 
		}
