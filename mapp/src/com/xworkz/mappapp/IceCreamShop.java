package com.xworkz.mappapp;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class IceCreamShop {

	public static void main(String[] args) {

		Map<String, Double> ice = new LinkedHashMap<String, Double>();

		ice.put("Strow Berry", 432.12);
		ice.put("Vennila", 453.50);
		ice.put("Choclate", 521.99);
		ice.put("Bananas foster", 855.95);
		ice.put("Beer with tart", 499.96);
		ice.put("Blue Moon", 844.98);
		ice.put("Cheese (queso)", 866.99);
		ice.put("Cherry in cone", 647.99);
		ice.put("Butterscotch in cone", 946.84);
		ice.put("Butter pecan caramel", 625.23);
		ice.put("Choclate", 511.99);
		ice.put(null, 254.25);

		System.out.println("After Size In ICE CREAM :" + ice.size());

		System.out.println("======Printing Keys======");
		Set<String> cream = ice.keySet();
		cream.forEach(e -> System.out.println(e));

//		for(String ref:cream) {
//			System.out.println(ref);
//		}

		System.out.println("=======Printing Vlues =======");

		Collection<Double> icecream = ice.values();
		icecream.forEach(c -> System.out.println(c));

		System.out.println("======Printing All Values=====");

		Set<Entry<String, Double>> value = ice.entrySet();
		value.forEach(a -> System.out.println(a));
	}

}
