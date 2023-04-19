package com.xworkz.Aeroplane.Service;

import java.util.Collections;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xworkz.Aeroplane.DTO.AeroplaneDTO;
import com.xworkz.Aeroplane.Entity.AeroplaneEntity;
import com.xworkz.Aeroplane.Repository.AeroplaneRepo;

@Service
public class AeroplaneServiceIMPL implements AeroplaneService {

	@Autowired
	private AeroplaneRepo aeroplaneRepo;

	public AeroplaneServiceIMPL() {
		System.out.println("Created :" + this.getClass().getSimpleName());
	}

	@Override
	public AeroplaneEntity finById(int id) {
		if (id > 0) {
			AeroplaneEntity aero = this.aeroplaneRepo.finById(id);
			if (aero != null) {
				System.out.println("entity is found in service for id" + id);
				AeroplaneEntity entit = new AeroplaneEntity();
				entit.setCompanyName(aero.getCompanyName());
				entit.setName(aero.getName());
				entit.setCost(aero.getCost());
				entit.setCountry(aero.getCountry());
				entit.setTypse(aero.getTypse());
				return entit;
			}
		}
		return AeroplaneService.super.finById(id);
	}

	@Override
	public Set<ConstraintViolation<AeroplaneDTO>> ValidateAndSave(AeroplaneDTO dto) {
		System.out.println("Created in ValidateAndSave....");

		ValidatorFactory foctory = Validation.buildDefaultValidatorFactory();
		Validator validator = foctory.getValidator();

		Set<ConstraintViolation<AeroplaneDTO>> violation = validator.validate(dto);
		if (violation != null && !violation.isEmpty()) {
			System.err.println("Violataion Excist return violation");
			return violation;
		} else {
			System.out.println("Violation does not excist Data Successs");

		}

		AeroplaneEntity entity = new AeroplaneEntity();

		entity.setCompanyName(dto.getCompanyName());
		entity.setName(dto.getName());
		entity.setCost(dto.getCost());
		entity.setTypse(dto.getType());
		entity.setCountry(dto.getCountry());

		boolean saved = aeroplaneRepo.Save(entity);
		System.out.println("Entity Saved :" + saved);
		return Collections.emptySet();
	}

}
