package com.xworkz.stringapp.String.Basic;

public class Arrays {

	public static void main(String[] args) {
		
		/* output will printing this type    ** input will be this type
		 *
		 * 1 2 3 4							  * 1 2 3 4
		 * 8 7 6 5 							  * 5 6 7 8
		 * 9 10 11 12						  * 9 10 11 12
		 * 16 15 14 13						  * 13 14 15 16
		 */
		
		int[] [] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		int row=4;
		int col=4;
		
		System.out.println("Original Array");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Output Array :");
		
		for(int i=0;i<row;i++) {
			if(i%2==0) {
				for(int j=0;j<col;j++) {
					System.out.print(arr[i][j]+" ");
				}
			}
			else {
				for(int j=col-1;j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
