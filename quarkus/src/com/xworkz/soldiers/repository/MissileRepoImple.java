package com.xworkz.soldiers.repository;

import org.springframework.stereotype.Component;

import com.xworkz.soldiers.dto.MissileDto;

@Component
public class MissileRepoImple implements MissileRepo {

	@Override
	public boolean Save(MissileDto dto) {
		System.out.println("Creating save in MissileRepoImpl");
		System.out.println(dto);
		return true;
	}

}
