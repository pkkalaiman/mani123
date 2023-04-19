package com.xworkz.array;

public class Minimum {
	
	public static void main(String[] args) {
		
		int arr[] =new int[] {23,54,34,54,2,43,4,5,7};
		
		int min= arr[0];
		
		for(int i=1;i<arr.length;i++)
			
			if(arr[i]<min)
		  min=arr[i];
		System.out.println(min);
	}

}
