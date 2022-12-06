package com.xworkz.stringapp.UppertoLoyer;

public class UpToLoyer {
	
	public static void main(String[] args) {
		
		/*int n =5;
		
		int x=(n*(n+1))/1;
	    for(int i=n;i>=1;i--) {
			
			for(int j=n;j>=i;j--) {
				
				System.out.printf("%3d",x--);
			}
			System.out.println();

		
	    }*/
	    
	    /*--------------------------------------------------------------------------------------------------------------------------*/
		
		int n=4;
		// i means row
		// j means column
		int x=(n*(n+1));
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("#");
			}
			System.out.println();
		}
	    
	}
}
