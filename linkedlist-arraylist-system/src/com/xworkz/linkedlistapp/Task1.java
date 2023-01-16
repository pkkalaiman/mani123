package com.xworkz.linkedlistapp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(45, 333, 29, 76, 29, 900, 23, 474, 654, 29, 454);

		int minValue = Collections.min(numbers);
		System.out.println("The minimum value is: " + minValue);

		int maxValue = Collections.max(numbers);
		System.out.println("The maximum value is: " + maxValue);

	}
}