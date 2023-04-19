package com.xworkz.bigbasket.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.bigbasket.entity.BigEntity;

@Repository
public class BigBasRepoImple implements BigBasRepo {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public BigBasRepoImple() {
		System.out.println("Created :" + this.getClass().getSimpleName());
	}

	@Override
	public boolean Save(BigEntity entity) {
		System.out.println("Running in Save....");

		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transection = entityManager.getTransaction();
		transection.begin();
		entityManager.persist(entity);
		transection.commit();
		entityManager.close();
		return false;
	}
	


}
