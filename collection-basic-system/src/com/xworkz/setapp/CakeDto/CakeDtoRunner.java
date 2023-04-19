package com.xworkz.setapp.CakeDto;

import java.util.LinkedHashSet;
import java.util.Set;

public class CakeDtoRunner {

	public static void main(String args[]) {

		CakeDto cakeDto1 = new CakeDto("Dhinesh", 450, "Red", "MariSelvam");

		CakeDto cakeDto2 = new CakeDto("Selvam", 500, "Yellow", "Sundhar C");

		Set<CakeDto> list = new LinkedHashSet<CakeDto>();

		list.add(cakeDto1); // hasCode --> get bucket number
		list.add(cakeDto2);  // hasCode

		System.out.println(list);

		for (CakeDto cakeDto : list) {
			

			// 20 because hasCode is return set this number
			System.out.println("Overiding :" + cakeDto.hasCode()); 
			System.out.println("Original :" + System.identityHashCode(cakeDto));
			
		}
	}

}
