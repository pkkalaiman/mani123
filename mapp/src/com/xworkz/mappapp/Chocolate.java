package com.xworkz.mappapp;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Chocolate {

	public static void main(String[] args) {

		Map<String, Integer> choco = new LinkedHashMap<String, Integer>();

		choco.put("5 STAR", 540);
		choco.put("Snickers", 420);
		choco.put("Dairy Milk", 640);
		choco.put("Lotus Dark", 210);
		choco.put(" Hershey Chocolates", 250);
		choco.put("Nestlie MUNCH", 210);
		choco.put("Amul Fruit", 110);
		choco.put("Parlea Kismi", 420);
		choco.put("Mars", 320);
		choco.put("FERRERO Richer", 210);
		choco.put("Pacari", 510);
		choco.put("CATBURRY", 150);
		choco.put("Godiva Chocolatier ", 483);
		choco.put("Ghirardelli ", 154);
		choco.put("Gombo Sugar-free", 400);
		choco.put("Lotte Chcopie", 135);

		System.out.println("Size Of The Object :" + choco.size());
		System.out.println();
		
		System.out.println("======Printing Keys=======");
		Set<String> ch = choco.keySet();
		ch.forEach(key -> System.out.println(key));
		System.out.println();
		
		System.out.println("=====Printing Values=======");
		Collection<Integer> col = choco.values();
		col.forEach(m -> System.out.println(m));
		System.out.println();

		System.out.println("====Printing Entry All=====");
		Set<Entry<String, Integer>> entry = choco.entrySet();
		entry.forEach(ele -> System.out.println(ele));

	}
}
