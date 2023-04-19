package com.xworkz.reggersing;

public class ReggersingOrder {
	static int n = 5;

	public static void display(int x) {

		if (n-- > 1) {
			System.out.print(x + " ");
			display(x + 1);
		}
		System.out.print(x + " ");
	}

	public static void main(String a[]) {
		display(1);
	}

}
