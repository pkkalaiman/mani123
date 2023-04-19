package com.xworkz.oddevennumberapp.NumberSeries;

public class Number {

	
	//1 1 1 3 2 5 3 7 5 9 Output
	
	
	public static void main(String[] args) {
		int n = 12;

		int a = 1, b = 1, c = 0;

		for (int i = 0; i <n; i++) {

			if (i % 2 == 0) {

				c = a + b;
				System.out.println(a+" ");
				
				a=b;
				b=c;
				
			}else {
				System.out.println(i+" ");
			}
		}

	}

}
