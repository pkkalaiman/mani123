
package com.xworkz.soldiers.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldiers.dto.MissileDto;
import com.xworkz.soldiers.repository.MissileRepo;
import com.xworkz.soldiers.repository.MissileRepoImple;

@Component
public class MissileServiceImple implements MissileService {

	@Autowired
	private Validator validator;

	private MissileRepoImple missileRepo;

	@Autowired
	public MissileServiceImple(MissileRepoImple missileRepo) {
		this.missileRepo = missileRepo;
	}

	@Override
	public boolean validateAndSave(MissileDto dto) {
		System.out.println("Running validateAndSave in MissileServiceImpl");
		System.out.println("dto " + dto);
	

	Set<ConstraintViolation<MissileDto>> violations = validator.validate(dto);

	if(!violations.isEmpty())
	{
		System.out.println("Data is contaning validation error");
		violations.forEach(a -> System.out.println(a.getMessage()));

	}else
	{
		System.out.println("Data is valid can save");
		boolean saved = this.missileRepo.Save(null);
		System.out.println("saved" + " " + saved);

	}return false;

}

}
