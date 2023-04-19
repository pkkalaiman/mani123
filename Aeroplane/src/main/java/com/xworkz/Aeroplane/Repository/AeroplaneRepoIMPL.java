package com.xworkz.Aeroplane.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.Aeroplane.Entity.AeroplaneEntity;

@Repository
public class AeroplaneRepoIMPL implements AeroplaneRepo {

	@Autowired
	private EntityManagerFactory entityMangerFactory;

	public AeroplaneRepoIMPL() {
		System.out.println("Created :" + this.getClass().getSimpleName());
	}

	@Override
	public boolean Save(AeroplaneEntity entity) {
		System.out.println("Running in Save Repository.....");

		EntityManager manager = this.entityMangerFactory.createEntityManager();

		EntityTransaction transection = manager.getTransaction();

		transection.begin();
		manager.persist(entity);
		transection.commit();
		manager.close();

		return true;
	}

	@Override
	public AeroplaneEntity finById(int id) {
		EntityManager manager = entityMangerFactory.createEntityManager();
		AeroplaneEntity enity = manager.find(AeroplaneEntity.class, id);
		manager.close();
		return enity;
	}

}
