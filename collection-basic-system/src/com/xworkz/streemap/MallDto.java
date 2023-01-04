package com.xworkz.streemap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class MallDto {
	
	public static void main(String []a) {
		
		Collection<String> malls=new ArrayList<String>();
		
		malls.add("D-mart");
		malls.add("Orien Mall");
		malls.add("Lulu mall");
		malls.add("Mantri Square");
		malls.add("Garuda");
		malls.add("Phoenix -Market City");
		malls.add("Royal Meenacthi");
		malls.add("New Forum Vlue");
		malls.add("D-mart");
		
		/*
		 * for (String string : malls) { System.out.println(string); }
		 */
		
		malls.stream().filter(dto -> dto.contains("-"))
		.collect(Collectors.toList())
		.forEach(dto->System.out.println(dto));
		
		
	
	}

	
}
