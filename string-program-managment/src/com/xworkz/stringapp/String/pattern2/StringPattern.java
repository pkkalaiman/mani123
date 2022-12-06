package com.xworkz.stringapp.String.pattern2;

public class StringPattern {
	
	
			public static void main(String[] args) {
				
			/*	 for(int row=1;row<=5;row++) {
	        		 
	        		 for(int col=1;col<=5;col++) {
	        			 
	        			 if(col==1 || col==5 || row==2 || row==5 ||row==2 || col==2) {
	        				 
	        				 System.out.print("#");
	        			 }else {
	        				 System.out.print(" ");
	        			 }
	        			 
	        		 }
	        		
	        		 System.out.println();
	        	 }*/
//****************************************************************************************************************				 
				 
                    for(int row=1;row<=5;row++) {
	        		 
	        		  for(int col=1;col<=5;col++) {
	        			 
	        			 if( row==3 && col==2 || row==2 && col==3 || row==3 && col==2  ||row==3 && col==4 || row==4 && col==3) {
	        				 
	        				 System.out.print(" ");
	        			 }else {
	        				 System.out.print("#");
	        			 }
	        			 
	        		 }
	        		
	        		 System.out.println();
	        	 }
				 
//****************************************************************************************************************************			 
				 
				 
				/* for(int row=1; row<=5;row++) {
					 for(int col=1;col<=5;col++) {
						 
						 if(row==3 && col==2 || row==2 && col==3 || row==3 && col==2 || row==3 && col==4 || row==4 && col==3) {
							 
							 System.out.print(" ");
							 
						 } else {
							 System.out.print("@");
					 }
					 }
				 }
				 */		 
				 
			}
			

}
