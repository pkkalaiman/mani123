package com.xworkz.festivelapp.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.festivelapp.entity.FestivelEntity;

public class FindByNameRuner {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();

		Query query = manager.createNamedQuery("findByName");
		query.setParameter("name", "Mani");

		FestivelEntity entity = (FestivelEntity) query.getSingleResult();

		System.out.println(entity);

		manager.close();
	}

}
