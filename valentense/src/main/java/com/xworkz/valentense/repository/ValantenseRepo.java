package com.xworkz.valentense.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.valentense.entity.ValantenseEntity;

public interface ValantenseRepo {

	boolean Save(ValantenseEntity entity);

	default ValantenseEntity findById(int id) {
		return null;
	}

	default List<ValantenseEntity> findByName(String name) {

		return Collections.emptyList();
	}

}
