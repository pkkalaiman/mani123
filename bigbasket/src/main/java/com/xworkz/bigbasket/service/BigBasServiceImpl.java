package com.xworkz.bigbasket.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bigbasket.DTO.BigBasDTO;
import com.xworkz.bigbasket.entity.BigEntity;
import com.xworkz.bigbasket.repository.BigBasRepo;

@Service
public class BigBasServiceImpl implements BigBasService {

	@Autowired
	private BigBasRepo bigBasRepo;

	public BigBasServiceImpl() {
		System.out.println("Created :" + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<BigBasDTO>> ValidateAndSave(BigBasDTO dto) {
		System.out.println("Running in BigBasServiceImple.....");
		System.out.println(dto);

		ValidatorFactory foctory = Validation.buildDefaultValidatorFactory();
		Validator validator = foctory.getValidator();

		Set<ConstraintViolation<BigBasDTO>> violation = validator.validate(dto);

		if (violation != null && !violation.isEmpty()) {
			System.err.println("Violation Excist Return Violation...");
			return violation;
		}

		else {
			System.out.println("Violation does not excist , Validation Seccusss");

			BigEntity entity = new BigEntity() {
			};

			BeanUtils.copyProperties(dto, entity);

			entity.setName(dto.getName());
			entity.setCustomerName(dto.getCustomerName());
			entity.setColor(dto.getColor());
			entity.setEmail(dto.getEmail());
			entity.setPassword(dto.getPassword());
			entity.setDate(dto.getDate());
			entity.setPhoneNumber(dto.getPhoneNo());
			entity.setPlace(dto.getPlace());
			entity.setPrice(dto.getPrice());
			entity.setQuantity(dto.getQuantity());
			entity.setProdectName(dto.getProdectName());

			boolean saved = bigBasRepo.Save(entity);
			System.out.println("Created in Save :" + saved);

			return Collections.emptySet();
		}

	}

}
