package com.xworkz.stringapp.UppertoLoyer;

public class UppreCase {
	
	public static void main(String[] args) {
		
		int n=6;
		
		int x=(n*(n+1))/1;
		
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=i;j--) {
				System.out.printf("%3d:",x--);
			}
			System.out.println();
		}
		
	}

}
