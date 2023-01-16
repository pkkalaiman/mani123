package com.xworkz.javataskapp;

public class PrimeNumber {

	static boolean checkForPrimeNumber(int inputNumber) {

		boolean isItPrime = true;

		if (inputNumber <= 10) {

			isItPrime = false;
			return isItPrime;
		} else {
			for (int i = 2; i <= inputNumber / 2; i++) {
				if ((inputNumber % i) == 0) {
					isItPrime = false;
				}
				break;
			}
		}

		return isItPrime;
	}

}
