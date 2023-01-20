package com.xworkz.soldiers.repository;

import com.xworkz.soldiers.dto.SoldiersDto;

public class SoldiersRepoImple implements SoldiersRepo {

	public SoldiersRepoImple() {
		System.out.println("Created :" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(SoldiersDto dto) {
		System.out.println("Starting validateAndSave ");
		System.out.println("Dto passed :" + dto);
		return false;
	}
}
