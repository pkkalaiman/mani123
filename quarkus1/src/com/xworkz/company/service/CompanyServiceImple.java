package com.xworkz.company.service;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.xworkz.company.dto.CompanyDto;
import com.xworkz.company.repository.CompanyRepo;

@Component
public class CompanyServiceImple implements CompanyService {

	@Autowired
	private Validator validator;

	private CompanyRepo company;

	@Autowired
	public void setCompany(CompanyRepo company) {
		this.company = company;
	}

	@Override
	public boolean ValidateAndSave(CompanyDto dto) {
		System.out.println("Created by VlaidateAnd Save ");
		System.out.println("Validate Dto :" + dto);

		ValidatorFactory foctory = Validation.buildDefaultValidatorFactory();
		Validator valiador = foctory.getValidator();

		Set<ConstraintViolation<CompanyDto>> violation = valiador.validate(dto);

		if (!violation.isEmpty()) {
			System.out.println("there are Validator Error");

			violation.forEach(m -> {
				System.out.println("Validate Message :" + m.getMessage());
			});
			return false;

		} else {
			System.out.println("Data is Valid");
			boolean saved = company.Save(dto);
			System.out.println("Valid Dto :" + dto);
			return true;
		}

	}

}
