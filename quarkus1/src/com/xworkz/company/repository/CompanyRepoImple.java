package com.xworkz.company.repository;

import org.springframework.stereotype.Component;

import com.xworkz.company.dto.CompanyDto;

@Component
public class CompanyRepoImple implements CompanyRepo {

	public CompanyRepoImple() {
		System.out.println("Created By CompanyRepoImple Non Orguments constructor");
	}

	@Override
	public boolean Save(CompanyDto dto) {
		System.out.println("Registered in CompanyImpleRepoImple");
		System.out.println("Dto :" + dto);
		return true;
	}

}
