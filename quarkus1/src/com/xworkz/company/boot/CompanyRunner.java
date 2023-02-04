package com.xworkz.company.boot;

import com.xworkz.company.dto.CompanyDto;
import com.xworkz.company.repository.CompanyRepoImple;
import com.xworkz.company.service.CompanyServiceImple;

public class CompanyRunner {

	public static void main(String[] args) {

		CompanyDto com = new CompanyDto("Infocies Softwear", "Mani P K", 05);

		CompanyDto com1 = new CompanyDto("Mani Softwear Solutoion", "Sathis Kumar", 10);

		CompanyServiceImple service = new CompanyServiceImple();

		CompanyRepoImple repo = new CompanyRepoImple();

		service.setCompany(repo);
		service.ValidateAndSave(com);
		System.out.println(" ");
		service.ValidateAndSave(com1);

	}
}
