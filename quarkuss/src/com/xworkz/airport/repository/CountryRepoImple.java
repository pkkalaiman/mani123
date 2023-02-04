package com.xworkz.airport.repository;

import org.springframework.stereotype.Component;

import com.xworkz.airport.dto.CountryDto;

@Component
public class CountryRepoImple implements CountryRepo {
	
	public CountryRepoImple() {
		System.out.println("Registered in CountryRepoImple");
	}

	@Override
	public boolean Save(CountryDto countrydto) {
		System.out.println("Created in Save");
		System.out.println("Dto :"+countrydto);
		return false;
	}

}
