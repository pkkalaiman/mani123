package com.xworkz.stringapp.GenerateOTP;

import java.util.SplittableRandom;

public class GenerateOtp {

	public static void main(String[] args) {

		System.out.println(GenerateOtp.generateOtp(5));
	}

	public static String generateOtp(int otplength) {

		SplittableRandom spliit = new SplittableRandom();
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < otplength; i++) {
			builder.append(spliit.nextInt(5, 10));
		}
		return builder.toString();
	}

}
