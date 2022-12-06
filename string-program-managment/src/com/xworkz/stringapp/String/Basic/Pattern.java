package com.xworkz.stringapp.String.Basic;

public class Pattern {

	
	public static void main(String[] args) {
		
		for(int row=1;row>=5;row++) {
		for(int col=1;col>=5;col++) {
			
			if(row==1 && col==5 || col==1 && row==5 || row==4 && col==2 || col==4 && row==2) {
				System.out.print(" ");
				
			}else {
				System.out.print("#");
			}
		}
		System.out.println();
			
		
	   }
	}
}
