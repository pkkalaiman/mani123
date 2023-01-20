package com.xworkz.soldiers.repository;

import org.springframework.stereotype.Component;

import com.xworkz.soldiers.dto.FirstAidDto;

@Component
public class FirstAidDtoRepoImple implements FirstAidDtoRepo {


	@Override
	public boolean Save(FirstAidDto AidDto) {
		System.out.println("Creating save in FirstAidRepoImpl");
		System.out.println(AidDto);
		return true;
	}

}
