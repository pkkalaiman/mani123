package com.xworkz.govrnmentapp;

import java.util.ArrayList;
import java.util.Collection;

public class StreamRunner {
	
	public static void main(String[] args) {
		
		StreamDto colors1=new StreamDto("Mani" , "Blue", 22);
		StreamDto colors2=new StreamDto("Sivagami", "Block", 54);
		StreamDto colors3=new StreamDto("Santhosh", "White", 23);
		
		
		Collection<StreamDto> colors=new ArrayList<StreamDto>();
		
		colors.add(colors3);
		colors.add(colors2);
		colors.add(colors1);
		
		
		
		for (StreamDto streamDto : colors) {
			
		System.out.println(streamDto);
		}
		
	}

}