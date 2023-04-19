package com.xworkz.array.minimumarry;

public class MinimumArr {
	
	public static void main(String[] args) {
		
		int arr[] =new int[] {23,34,12,2,12,34,6,9};
		
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++)
			
			if(arr[i]<min)
				min=arr[i];
		System.out.println(min);
		
		
	}

}
