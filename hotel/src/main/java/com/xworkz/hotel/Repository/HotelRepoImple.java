package com.xworkz.hotel.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;

import com.xworkz.hotel.DTO.HotelDTO;

@Repository
public class HotelRepoImple implements HotelRepo {
	
	@Autowired
	public EntityManagerFactory entityManagerFactory;

	public HotelRepoImple() {
		System.out.println("Created : " + this.getClass().getSimpleName());
	}

	@Override
	public boolean Save(HotelDTO dto) {
		System.out.println("Running in Save......");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transection = entityManager.getTransaction();
		transection.begin();
		entityManager.persist(dto);
		transection.commit();
		entityManager.close();
		return false;
	}

}
