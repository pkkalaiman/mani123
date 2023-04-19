package com.xworkz.valentense.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.valentense.DTO.ValantenseDTO;
import com.xworkz.valentense.entity.ValantenseEntity;

public interface ValantenseService {

	Set<ConstraintViolation<ValantenseDTO>> ValidateAndSave(ValantenseDTO dto);

	default ValantenseEntity findById(int id) {
		return null;
	}

	default List<ValantenseDTO> findByName(String name){
		return Collections.emptyList();
	}

}
