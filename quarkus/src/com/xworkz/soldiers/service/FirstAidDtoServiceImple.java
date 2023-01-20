package com.xworkz.soldiers.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldiers.dto.FirstAidDto;
import com.xworkz.soldiers.repository.FirstAidDtoRepo;

@Component
public class FirstAidDtoServiceImple implements FirstAidDtoService {

	@Autowired
	private Validator validator;
	
	private FirstAidDtoRepo firstAidRepo;
	
	 @Autowired
	 public FirstAidDtoServiceImple(FirstAidDtoRepo firstAidRepo) {
		this.firstAidRepo=firstAidRepo;
		
	}

	@Override
	public boolean ValidateSave(FirstAidDto dto) {
		System.out.println("Running validateAndSave");
		System.out.println("dto " + dto);
		
		Set<ConstraintViolation<FirstAidDto>> violations=  validator.validate(dto);
		
		if(!violations.isEmpty()) {
			System.err.println("Data is contaning validation error");
			violations.forEach(e->System.err.println(e.getMessage()));
			return false;
		}
		else {
			System.out.println("Data is valid can save");
			boolean saved=this.firstAidRepo.Save(dto);
			System.out.println("saved firstAid" +"  "+ saved);
			return saved;
		}
		}
	
	}


