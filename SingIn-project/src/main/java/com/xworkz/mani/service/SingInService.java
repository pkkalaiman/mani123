package com.xworkz.mani.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.mani.DTO.SingInDTO;
import com.xworkz.mani.Entity.TechnologyEntity;

public interface SingInService {

	Set<ConstraintViolation<SingInDTO>> validateAndSave(SingInDTO sindto);

	default SingInDTO userSignIn(String userId, String password) {
		return null;
	}

	default List<SingInDTO> findAll() {
		return Collections.emptyList();
	}

	default Long findByEmail(String email) {
		return null;
	}

	default Long findByMobile(Long mobile) {
		return null;
	}

	default Long findByUser(String user) {
		return null;
	}

	default SingInDTO reSetPassword(String email) {
		return null;
	}

	default SingInDTO updatePassword(String userId, String password, String confirmPassword) {
		return null;
	}

	boolean sendMail(String email, String text);

	default SingInDTO updateProfile(String userId, String email, Long mobile, String imagePath) {
		return null;
	}

	default SingInDTO addTechnology(String userId, TechnologyEntity entity) {
		return null;
	}

	default List<TechnologyEntity> viewTechnology(String userId) {
		return null;
	}
}
