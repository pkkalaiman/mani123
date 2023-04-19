package com.xworkz.bigbasket.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.bigbasket.DTO.BigBasDTO;

public interface BigBasService {

	Set<ConstraintViolation<BigBasDTO>> ValidateAndSave(BigBasDTO dto);
}
