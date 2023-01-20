package com.xworkz.soldiers.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.xworkz.soldiers.dto.RessortDto;
import com.xworkz.soldiers.repository.RessortRepo;

@Component
public class RessortServiceImple implements RessortService {

	@Autowired
	private Validator validator;
	private RessortRepo resortrepo;
	
	@Autowired
	public RessortServiceImple(RessortRepo resortrepo) {
		this.resortrepo=resortrepo;
	}
	
	@Override
	public boolean ValidateAndSave(RessortDto dto) {
		System.out.println("Registered in ValidateAndSave");
		System.out.println("Dto :"+dto);
		
		Set<ConstraintViolation<RessortDto>> violation = validator.validate(dto);

		if(!violation.isEmpty()) {
			System.err.println("Data is contaning validation error");
			violation.forEach(e->System.err.println(e.getMessage()));
			return false;
		}
		else {
			System.out.println("Data is valid can save");
			boolean saved=this.resortrepo.Save(dto);
			System.out.println("saved RessortAid" +"  "+ saved);
			return saved;
		}
		
	}

}
