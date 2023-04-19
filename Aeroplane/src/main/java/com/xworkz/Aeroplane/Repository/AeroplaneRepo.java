package com.xworkz.Aeroplane.Repository;

import com.xworkz.Aeroplane.Entity.AeroplaneEntity;

public interface AeroplaneRepo {

	boolean Save(AeroplaneEntity entity);

	default AeroplaneEntity finById(int id) {

		return null;
	}

}
