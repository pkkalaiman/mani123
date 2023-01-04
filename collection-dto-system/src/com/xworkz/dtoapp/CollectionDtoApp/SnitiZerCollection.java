
package com.xworkz.dtoapp.CollectionDtoApp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class SnitiZerCollection {

	public static void main(String[] args) {

		SanitizerDto obj = new SanitizerDto(101, "M ani", 443.34, "Yellow", "Kooky Klutter");
		SanitizerDto obj1 = new SanitizerDto(102, "KaliMan", 847.54, "Red", "Olde Dirt");
		SanitizerDto obj2 = new SanitizerDto(103, "Sarath", 487.78, "Blue", "Buggy Be Gone");
		SanitizerDto obj3 = new SanitizerDto(104, "Bargavi", 746.88, "Green", "Flirty Floater");
		SanitizerDto obj4 = new SanitizerDto(105, "Sangeeth", 873.98, "Gray", "Fanciful Nonsense");
		SanitizerDto obj5 = new SanitizerDto(106, "Dhanaseker", 745.88, "Red", "Bananarama");
		SanitizerDto obj6 = new SanitizerDto(107, "Dharman", 764.98, "Voilet", "Mango-Aid");
		SanitizerDto obj7 = new SanitizerDto(108, "Guna Sager", 985.78, "Yellow", "Handle with Care");
		SanitizerDto obj8 = new SanitizerDto(109, "Harish", 725.78, "Ligth Blue", "Good as Gold!");
		SanitizerDto obj9 = new SanitizerDto(111, "Kalai Man", 826.78, "Voilet", "Orange Glove Savior");
		SanitizerDto obj10 = new SanitizerDto(112, "Krishna Moorthy", 276.78, "MangoGray", "Coldsore Killas");
		SanitizerDto obj11 = new SanitizerDto(113, "Guru", 892.78, "Green", "Germ Terminator");
		SanitizerDto obj12 = new SanitizerDto(113, null, 892.78, null, null);

		Collection<SanitizerDto> sanitizer = new ArrayList<SanitizerDto>();

		sanitizer.add(obj2);
		sanitizer.add(obj1);
		sanitizer.add(obj);
		sanitizer.add(obj3);
		sanitizer.add(obj4);
		sanitizer.add(obj5);
		sanitizer.add(obj6);
		sanitizer.add(obj7);
		sanitizer.add(obj8);
		sanitizer.add(obj9);
		sanitizer.add(obj10);
		sanitizer.add(obj11);
		sanitizer.add(obj12);

		/*
		 * for(SanitizerDto sanni : col) { System.out.println(sanni); }
		 * 
		 */

		for (Object sanitizer1 : sanitizer) {
			System.out.println(sanitizer1);
		}

		System.out.println();

		Iterator<SanitizerDto> itr = sanitizer.iterator();

		while (itr.hasNext()) {
			SanitizerDto ref = itr.next();
			System.out.println(ref.getBrand());
			System.out.println(ref);

			if (ref.getPrice() > 487) {
				// ref.setPrice(847);
				System.out.println("Price :" + ref.getPrice());
				// System.out.println("Brand :"+ref.getBrand());
				// System.out.println("Color :"+ref.getColor());
			}
		}
		System.out.println();
		for (SanitizerDto sanitizerDTO : sanitizer) {
			System.out.println(sanitizerDTO.getPrice() > 200);
		}

		for (SanitizerDto sanitizerDTO : sanitizer) {

			System.out.println(sanitizer.contains(obj2));
			System.out.println(sanitizerDTO);
		}

			System.out.println("After sanitizer size :"+sanitizer.size());
			System.out.println();

		

		for (SanitizerDto dto : sanitizer) {
			System.out.println(dto.getColor());

		}

		System.out.println("=======equals method ==========");

		boolean equals = obj.equals(obj3);
		System.out.println(equals);

		System.out.println();

		System.out.println("=========Find Minimium Price Sanitizer ========");

		Iterator<SanitizerDto> itr1 = sanitizer.iterator();

		SanitizerDto san = sanitizer.stream().min(Comparator.comparing(SanitizerDto::getPrice)).get();

		System.out.println("Min Price Of Sanitizer :" + san);

		System.out.println();

		System.out.println("============ Find Max Price Sanitizer =============");

		SanitizerDto san1 = sanitizer.stream().max(Comparator.comparing(SanitizerDto::getPrice)).get();
		System.out.println("Maximum Price Of Sanitizer :" + san1);

	}

}
