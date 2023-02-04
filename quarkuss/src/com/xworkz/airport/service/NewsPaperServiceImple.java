package com.xworkz.airport.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.airport.dto.NewsPaperDto;
import com.xworkz.airport.repository.NewsPaperRepoImple;

@Component
public class NewsPaperServiceImple implements NewsPaperService {

	@Autowired
	private Validator validator;

	private NewsPaperRepoImple newspaper;

	@Autowired
	public void setNewspaper(NewsPaperRepoImple newspaper) {
		this.newspaper = newspaper;
	}

	@Override
	public boolean ValidateAndSave(NewsPaperDto dto) {
		System.out.println("Regidtered In Spring ValidateAndSave");
		System.out.println("Validate Dto :" + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

		Validator validator = factory.getValidator();

		Set<ConstraintViolation<NewsPaperDto>> violation = validator.validate(dto);

		if (!violation.isEmpty()) {
			System.out.println("there are Validator Eroor");
			violation.forEach(m -> {
				System.out.println(m.getMessage());
			});
			return false;
		} else {
			System.out.println("Validator Error");
			boolean saved = newspaper.Save(dto);
			System.out.println("Dto :" + dto);

			return true;
		}
	}

}
