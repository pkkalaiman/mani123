package com.xworkz.stringapp.UppertoLoyer;

public class LoyToUpp {

	
	public static void main(String[] args) {
		
		int n=5;
		
		int x=(n*(n+2))/2;
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {
				System.out.printf("%3d:",x--);
			}
		}
		System.out.println();
	}
}
