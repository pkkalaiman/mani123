package com.xworkz.array;

public class LorgestNumber {
	
	public static void main(String[] args) {
		
		
		  int arr[]=new int[] {120,32,54,76,87,87,57,9999,2900};
		  
		  int max=arr[0];  // i will store to the element
		  
		  for(int i=1;i<arr.length;i++) 
			  if(arr[i]>max) 
				  max=arr[i];
		  
		  System.out.println(max);
		 
		

		
		
	}

}
