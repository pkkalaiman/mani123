package com.xworkz.soldiers.repository;

import org.springframework.stereotype.Component;

import com.xworkz.soldiers.dto.RessortDto;

@Component
public class RessortRepoImple implements RessortRepo {

	@Override
	public boolean Save(RessortDto resdto) {
		System.out.println("Creating save in FirstAidRepoImpl");
		System.out.println(resdto);
		return true;
	}

}
