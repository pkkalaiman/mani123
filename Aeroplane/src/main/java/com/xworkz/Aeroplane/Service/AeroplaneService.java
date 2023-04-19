package com.xworkz.Aeroplane.Service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.Aeroplane.DTO.AeroplaneDTO;
import com.xworkz.Aeroplane.Entity.AeroplaneEntity;

public interface AeroplaneService {

	Set<ConstraintViolation<AeroplaneDTO>> ValidateAndSave(AeroplaneDTO dto);

	default AeroplaneEntity finById(int id) {
		return null;
	}
	


}
