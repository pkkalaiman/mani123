package com.xworkz.soldiers.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldiers.dto.SoldiersDto;
import com.xworkz.soldiers.repository.SoldiersRepo;
import com.xworkz.soldiers.repository.SoldiersRepoImple;

public class SoldiersServiceImpl implements SoldiersService {

	public SoldiersRepoImple solderRpo;

	public void setSolderRpo(SoldiersRepoImple solderRpo) {
		this.solderRpo = solderRpo;
	}

	  public boolean isSolderRpo(SoldiersRepo dto) {
	  System.out.println(" Starting SolderRepo");
	  System.out.println("Dto passed" +dto); return false; }
	 
	  
	public SoldiersServiceImpl() {
		System.out.println("Created SoldiersServiceImpl using no argument constructor");
	}

	@Override
	public boolean validateAndSave(SoldiersDto dto) {
		System.out.println("Starting validateAndSave ");
		System.out.println("dto passed :" + dto);

		// now you will c reated to 3 steps
		// Factory
		// Validator
		// Validate

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldiersDto>> violation = validator.validate(dto);

		if (!violation.isEmpty()) {
			System.err.println("there are validator errors");

			violation.forEach(v -> {
				System.err.println("Vilotor message :" + v.getMessage());
			});
			return false;

		} else {
			System.out.println("Data is valid");
			boolean saved = solderRpo.save(dto);
			System.out.println("Dto saved :" + saved);
			return saved;
		}

	}

}
