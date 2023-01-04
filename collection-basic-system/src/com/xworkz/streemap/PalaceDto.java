package com.xworkz.streemap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class PalaceDto {
	
	public static void main(String[] args) {
		
		Collection<String> colors=new ArrayList<String>();
		
		colors.add("Blue");
		colors.add("Red");
		colors.add("Green");
		colors.add("White");
		colors.add("Orange");
		colors.add("Yellow");
		colors.add("Tick Blue");
		colors.add("Gray");
		
		
		//custom type---->
		
		colors.stream().map(dto-> dto.toUpperCase())
		.collect(Collectors.toList())
		.forEach(dto->System.out.println(dto));
		
		System.out.println();
		colors.stream().filter(ele -> ele.endsWith("d"))
		.collect(Collectors.toList())
		.forEach(ele -> System.out.println(ele));
		
		
	}

}
