package com.xworkz.airport.repository;

import org.springframework.stereotype.Component;

import com.xworkz.airport.dto.NewsPaperDto;

@Component
public class NewsPaperRepoImple implements NewsPaperRepo {

	public NewsPaperRepoImple() {
		System.out.println("Created in NewsPaperRepoImple");
		
	}
	
	@Override
	public boolean Save(NewsPaperDto dto) {
		System.out.println("Registered In Spring to Save");
		System.out.println("Dto :"+dto);
		return false;
	}

}
